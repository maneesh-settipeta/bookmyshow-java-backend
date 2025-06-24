package com.example.BookMyShow.dto;

import java.util.HashMap;

public class SeatDetails {
	
	private HashMap<String,HashMap<String,SingleSeatDetail>> seatDetails;
	
	public void setSeatDetails( HashMap<String,HashMap<String,SingleSeatDetail>> seatDetails){
		this.seatDetails=seatDetails;
	}
	
	public HashMap<String, HashMap<String, SingleSeatDetail>> getseatDetails(){
		return seatDetails;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private Integer seatId;
//	private Integer showId;
//	private String seatNumber;
//	private String seatRow;
//	private String seatStatus;
//	
//	public Integer getSeatId() {
//		return seatId;
//	}
//	public void setSeatId(Integer seatId) {
//		this.seatId = seatId;
//	}
//	public Integer getShowId() {
//		return showId;
//	}
//	public void setShowId(Integer showId) {
//		this.showId = showId;
//	}
//	public String getSeatNumber() {
//		return seatNumber;
//	}
//	
//	public void setSeatNumber(String seatNumber) {
//		this.seatNumber = seatNumber;
//	}
//	public String getSeatRow() {
//		return seatRow;
//	}
//	public void setSeatRow(String seatRow) {
//		this.seatRow = seatRow;
//	}
//	public String getSeatStatus() {
//		return seatStatus;
//	}
//	public void setSeatStatus(String seatStatus) {
//		this.seatStatus = seatStatus;
//	}
//
//	
//	public SeatDetails() {
//	}
//	
//	

}
