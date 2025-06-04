package com.example.BookMyShow.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Seats;
import com.example.BookMyShow.Repository.SeatRepository;


@Service
public class SeatServiceImpl implements SeatService {

	
	SeatRepository seatRepository;

	@Autowired
	public SeatServiceImpl(SeatRepository seatRepository) {
		this.seatRepository = seatRepository;
	}
	
	public List<Seats> addAllSeats(List<Seats> seats){
		 return seatRepository.saveAll(seats);
	}
}
