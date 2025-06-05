package com.example.BookMyShow.dto;

import java.util.ArrayList;
import java.util.List;

public class TheatreShowDto {
	
	private Integer movieId;
	private String movieName;
	private String cityName;
	private List<MovieShowsDto> movieShows;
	
	
	public void addMovieShows(List<MovieShowsDto> show) {
		this.movieShows.addAll(show);
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
	public TheatreShowDto(Integer movieId, String movieName, String cityName) {
	this.movieId = movieId;
	this.movieName = movieName;
	this.cityName = cityName;
	this.movieShows = new ArrayList<>();
	}
	

	public TheatreShowDto() {

	}
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public List<MovieShowsDto> getMovieShows() {
		return movieShows;
	}
	public void setMovieShows(List<MovieShowsDto> movieShows) {
		this.movieShows = movieShows;
	}
	

}
