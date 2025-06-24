package com.example.BookMyShow.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.ShowDetails;
import com.example.BookMyShow.Repository.ShowDetailsRepository;
import com.example.BookMyShow.dto.ShowDetailsDto;
import com.example.BookMyShow.exceptions.MovieNotFoundException;
import com.example.BookMyShow.utils.ErrorMessage;
import com.example.BookMyShow.utils.TimeUtils;

@Service
public class ShowDetailsService {

	ShowDetailsRepository showDetailsrepository;
	
	@Autowired
	public ShowDetailsService(ShowDetailsRepository showDetailsrepository) {
		this.showDetailsrepository =showDetailsrepository;
	}
	public ShowDetailsService() {
		
	}
	
	public ShowDetails findShowDetails(Integer showId) {
//		try {
			ShowDetailsDto showDetailsDto =  showDetailsrepository.findShowDetailsRepository(showId);
			
			if(showDetailsDto==null) {
				throw new MovieNotFoundException("Movie Not found "+ showId);
			}
			
			String date = TimeUtils.extractDate(showDetailsDto.getShowTime());
			String time = TimeUtils.extractTime(showDetailsDto.getShowTime());
			
			ShowDetails showDetails = new ShowDetails();
			showDetails.setMovieId(showDetailsDto.getMovieId());
			showDetails.setMovieName(showDetailsDto.getMovieName());
			showDetails.setShowDate(date);
			showDetails.setShowId(showDetailsDto.getShowId());
			showDetails.setShowTime(time);
			showDetails.setTheatreId(showDetailsDto.getTheatreId());
			showDetails.setTheatreName(showDetailsDto.getTheatreName());
//			return ResponseEntity.ok(showDetails);
			
			return showDetails;
//		} catch (MovieNotFoundException e) {
			// TODO: handle exception
//			ErrorMessage error = new ErrorMessage(e.getMessage(),false);
////			return new ResponseEntity<>(error , HttpStatus.NOT_FOUND);
////			
//		}
		
	}
}
