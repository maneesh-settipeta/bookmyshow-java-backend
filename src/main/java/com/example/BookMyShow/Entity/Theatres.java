package com.example.BookMyShow.Entity;

import java.sql.Timestamp;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonProperty;




@Entity
@Table(name = "theatres")
public class Theatres {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="theatre_id")
	private Integer theatreId;

	@JsonProperty("theatre_name")
	@Column(name="theatre_name")
	private String theatreName;
	
	@JsonProperty("city_id")
	@Column(name="city_id")
	private Integer cityId;
	
	@Column(name="movie_id")
	private Integer movieId;
	
	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Theatres() {
		
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

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}


}