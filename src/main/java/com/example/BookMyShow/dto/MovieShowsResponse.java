package com.example.BookMyShow.dto;

import java.sql.Timestamp;

public class MovieShowsResponse {
	
	private int movieId;
	private String movieName;
	private Timestamp showTime;
	private int showId;
	private int theatreId;
	private String theatreName;
	private String cityName;
	
	public MovieShowsResponse() {
	}

	public MovieShowsResponse(int movieId, String movieName, Timestamp showTime, int showId, int theatreId,
			String theatreName, String cityName) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.showTime = showTime;
		this.showId = showId;
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.cityName = cityName;
	}

//	public int getSeatId() {
//		return seatId;
//	}
//
//
//	public void setSeatId(int seatId) {
//		this.seatId = seatId;
//	}
//
//
//	public String getSeatNumber() {
//		return seatNumber;
//	}
//
//
//	public void setSeatNumber(String seatNumber) {
//		this.seatNumber = seatNumber;
//	}


	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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



	@Override
	public String toString() {
		return "MovieShowsResponse [movieId=" + movieId + ", movieName=" + movieName + ", showTime=" + showTime
				+ ", showId=" + showId + ", theatreId=" + theatreId + ", theatreName=" + theatreName + ", cityName="
				+ cityName + ",]";
	}
	

}
