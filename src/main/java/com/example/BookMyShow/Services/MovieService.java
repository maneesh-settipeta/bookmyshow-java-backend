package com.example.BookMyShow.Services;

import java.util.List;

import com.example.BookMyShow.Entity.Movies;


public interface MovieService {

	public List<Movies> addMovies(List<Movies> movies);
	public List<Movies> findAllMovies();
	public List<Movies> findAllMoviesByCityId(Integer cityId);
}
