package com.example.BookMyShow.dto;

public class SingleSeatDetail {
	
	private Integer seatId;
	private String seatStatus;
	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public String getSeatStatus() {
		return seatStatus;
	}
	public SingleSeatDetail() {
	}
	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}
	
}
