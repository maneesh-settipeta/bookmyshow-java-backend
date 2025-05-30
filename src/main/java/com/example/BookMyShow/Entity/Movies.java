package com.example.BookMyShow.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity


public class Movies {
	
//	@ManyToMany
//	@JoinTable(
//			name="movie_theatre",
//			joinColumns = @JoinColumn(name="movie_id")
//			,inverseJoinColumns = @JoinColumn(name="theatre_id"))
//	private List<Theatres> theatres;
//	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	private String movieName;
	
	private List<Integer> theatres;
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
	public Movies() {
		
	}
}
