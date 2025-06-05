package com.example.BookMyShow.dto;

import java.sql.Timestamp;

public class MovieShowsResponse {
	
	private Integer movieId;
	private String movieName;
	private Timestamp showTime;
	private Integer showId;
	private Integer theatreId;
	private String theatreName;
	private String cityName;

	public MovieShowsResponse() {
		
	}

    

	public MovieShowsResponse(Integer movieId, String movieName, Timestamp showTime, Integer showId, Integer theatreId,
			String theatreName, String cityName) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.showTime = showTime;
		this.showId = showId;
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.cityName = cityName;
			}



	


	public Integer getMovieId() {
		return movieId;
	}
	
	public void setMovieId(Integer movieId) {
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
	public Integer getTheatreId() {
		return theatreId;
	}
	
	public void setTheatreId(Integer theatreId) {
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
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}



	@Override
	public String toString() {
		return "MovieShowsResponse [movieId=" + movieId + ", movieName=" + movieName + ", showTime=" + showTime
				+ ", showId=" + showId + ", theatreId=" + theatreId + ", theatreName=" + theatreName + ", cityName="
				+ cityName + "]";
	}

	

}
