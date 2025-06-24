package com.example.BookMyShow.Services;
import  com.example.BookMyShow.Services.ShowDetailsService;
import com.example.BookMyShow.dto.SeatDetails;
import com.example.BookMyShow.dto.SeatsSummaryResponse;
import com.example.BookMyShow.dto.SingleSeatDetail;
import com.example.BookMyShow.exceptions.MovieNotFoundException;
import com.example.BookMyShow.exceptions.SeatsNotFoundException;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.BookMyShow.Entity.Seats;
import com.example.BookMyShow.Entity.ShowDetails;
import com.example.BookMyShow.Repository.SeatRepository;


@Service
@Slf4j
public class SeatServiceImpl implements SeatService {
	SeatRepository seatRepository;
	ShowDetailsService showDetailsService;


	@Autowired
	public SeatServiceImpl(SeatRepository seatRepository , ShowDetailsService showDetailsService) {
		this.seatRepository = seatRepository;
		this.showDetailsService =showDetailsService;
	}

	public List<Seats> addAllSeats(List<Seats> seats){
		return seatRepository.saveAll(seats);
	}

	@Cacheable(value = "seats", key = "#showId")
//	@CacheEvict(value = "seats" , key = "#showId")
	public SeatsSummaryResponse findSeatsByShowIdService(Integer showId) {
		System.out.println(showId + "Not cached!!!!!!!!");
		ShowDetails seatDetailsFrom = showDetailsService.findShowDetails(showId);
		List<Seats> seats = seatRepository.findSeatsByShowIdOrderBySeatId(showId);
		
		if(seatDetailsFrom == null) {
			throw new MovieNotFoundException("Movie Not found with ID: " + showId);
		}
		
		if(seats == null || seats.isEmpty()) {
			throw new SeatsNotFoundException("No Seats found for show ID : "+ showId);
		}
		

        HashMap<String,HashMap<String,SingleSeatDetail>> seatRowDetail = new  HashMap<>();

		for(Seats seat : seats) {
//			log.info("Getting In");
			
			SingleSeatDetail singleSeatDetail = new SingleSeatDetail();	
			Integer seatId = seat.getSeatId();
			String seatStatus = seat.getSeatStatus();
			String seatNumber = seat.getSeatNumber();
			String seatRow = seat.getSeatRow();
			
			HashMap<String,SingleSeatDetail> singleSeat = new HashMap<>();	
			singleSeatDetail.setSeatId(seatId);
            singleSeatDetail.setSeatStatus(seatStatus);  
            if(seatRowDetail.containsKey(seatRow)) {
            	if(!singleSeat.containsKey(seatNumber)) {
//            		HashMap<String,SingleSeatDetail> singleSeatDup = new HashMap<>();
            		singleSeat.put(seatNumber, singleSeatDetail);
            		seatRowDetail.get(seatRow).putAll(singleSeat);
            	}
            }
            else {
            	 singleSeat.put(seatNumber, singleSeatDetail);
            	 seatRowDetail.put(seatRow, singleSeat);
            }        
			
		}
		
		SeatDetails seatDetails = new SeatDetails();
		seatDetails.setSeatDetails(seatRowDetail);
		
		SeatsSummaryResponse seatsSummaryResponse = new SeatsSummaryResponse();
		
		seatsSummaryResponse.setSeatDetails(seatDetails);
		seatsSummaryResponse.setShowDetails(seatDetailsFrom);
		
		return seatsSummaryResponse;
	}
}
