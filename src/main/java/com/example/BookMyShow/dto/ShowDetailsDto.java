package com.example.BookMyShow.dto;

import java.sql.Timestamp;

public class ShowDetailsDto {
	
	private Integer movieId;
	private String movieName;
	private Integer theatreId;
	private String theatreName;
	private Integer showId;
	private Timestamp showTime; 
    private String cityName;
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
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Timestamp getShowTime() {
		return showTime;
	}
	public ShowDetailsDto() {
		
	}
	public void setShowTime(Timestamp showTime) {
		this.showTime = showTime;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	  public ShowDetailsDto(
		        Integer movieId,
		        String movieName,
		        Integer theatreId,
		        String theatreName,
		        Integer showId,
		        Timestamp showTime,
		        String cityName
		    ) {
		        this.movieId = movieId;
		        this.movieName = movieName;
		        this.theatreId = theatreId;
		        this.theatreName = theatreName;
		        this.showId = showId;
		        this.showTime = showTime;
		        this.cityName = cityName;
		    }
}
