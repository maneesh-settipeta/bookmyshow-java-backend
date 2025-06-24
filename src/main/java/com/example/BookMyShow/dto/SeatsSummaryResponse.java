package com.example.BookMyShow.dto;

import com.example.BookMyShow.Entity.ShowDetails;

public class SeatsSummaryResponse {
	
	private ShowDetails showDetails;
	private SeatDetails seatDetails;
	public ShowDetails getShowDetails() {
		return showDetails;
	}
	public void setShowDetails(ShowDetails showDetails) {
		this.showDetails = showDetails;
	}
	public SeatDetails getSeatDetails() {
		return seatDetails;
	}
	public void setSeatDetails(SeatDetails seatDetails) {
		this.seatDetails = seatDetails;
	}
	public SeatsSummaryResponse() {

	}
	

}
