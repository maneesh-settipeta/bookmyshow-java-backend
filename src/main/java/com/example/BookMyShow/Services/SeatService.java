package com.example.BookMyShow.Services;

import java.util.List;

import com.example.BookMyShow.Entity.Seats;
import com.example.BookMyShow.Entity.ShowDetails;
import com.example.BookMyShow.dto.SeatsSummaryResponse;

public interface SeatService {
	
	public List<Seats> addAllSeats(List<Seats> seats);
	public SeatsSummaryResponse findSeatsByShowIdService(Integer showId);

}
