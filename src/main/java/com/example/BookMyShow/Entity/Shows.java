package com.example.BookMyShow.Entity;

import java.sql.Timestamp; // Use Timestamp, not Date


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "shows")
public class Shows {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="show_id")
	private Integer showId;

//	@JsonSerialize(using = JsonTimestampSerializer.class)
	@Column(name="show_time")
	private Timestamp showTime;

	public Shows() {
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

	public void setShowTime(Timestamp showTime) {
		this.showTime = showTime;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	@Column(name="movie_id")
	private Integer movieId;

	@Column(name="theatre_id")
	private Integer theatreId;
	
	@Column(name="city_id")
	private Integer cityId;
	
	
	public void setCityId(Integer cityId) {
		this.cityId=cityId;
	}
	
	public Integer getCityId(Integer getCityId) {
		return cityId;
	}
	
}