package com.example.BookMyShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Entity.Seats;
import com.example.BookMyShow.Entity.ShowDetails;
import com.example.BookMyShow.Services.SeatService;
import com.example.BookMyShow.dto.SeatsSummaryResponse;
import com.example.BookMyShow.exceptions.MovieNotFoundException;
import com.example.BookMyShow.utils.ErrorMessage;

@RestController
@RequestMapping("seat/v1")
public class SeatController {
	
	
	@Autowired
	SeatService seatService;
	
	public SeatController(SeatService seatService) {
		this.seatService = seatService;
	}
	
	@PostMapping("/seats")
	public ResponseEntity<List<Seats>> addSeats(@RequestBody List<Seats> seats){
		List<Seats> addSeats = seatService.addAllSeats(seats);
		return ResponseEntity.ok(addSeats);
	}
	
	@GetMapping("/seats/selection")
	public ResponseEntity<?> findSeatsByShowIdControler(@RequestParam("showId") Integer showId){

			SeatsSummaryResponse findfindSeatsByShowId = seatService.findSeatsByShowIdService(showId);
			System.out.println("SeatsEndpoint");
			return ResponseEntity.ok(findfindSeatsByShowId);			
	}

}
