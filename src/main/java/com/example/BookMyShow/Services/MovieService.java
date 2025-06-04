package com.example.BookMyShow.Services;

import java.util.List;

import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.dto.MovieShowsDto;
import com.example.BookMyShow.dto.MovieShowsResponse;
import com.example.BookMyShow.dto.TheatreShowDto;


public interface MovieService {

	public List<Movies> addMovies(List<Movies> movies);
	public List<Movies> findAllMovies();
	public List<Movies> findAllMoviesByCityId(Integer cityId);
	public TheatreShowDto findAllMoviesByMovieIdAndCityId(Integer movieId, Integer cityId);
}
