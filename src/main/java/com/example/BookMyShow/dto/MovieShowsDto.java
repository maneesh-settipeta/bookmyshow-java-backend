package com.example.BookMyShow.dto;

import java.sql.Timestamp;

public class MovieShowsDto {
	
	private int theatreId;
	private String theatreName;
	
	public MovieShowsDto(int theatreId, String theatreName, Timestamp showTime, int showId) {
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.showTime = showTime;
		this.showId = showId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public Timestamp getShowTime() {
		return showTime;
	}
	public void setShowTime(Timestamp showTime) {
		this.showTime = showTime;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	private Timestamp showTime;
	private int showId;

}
