package com.example.BookMyShow.dto;

import java.util.ArrayList;
import java.util.List;

public class TheatreShowDto {
	
	private int movieId;
	private String movieName;
	private String cityName;
	private List<MovieShowsDto> movieShows;
	
	
	public void addMovieShows(MovieShowsDto show) {
		this.movieShows.add(show);
	}
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
	public TheatreShowDto(int movieId, String movieName, String cityName) {
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
