package com.example.BookMyShow.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.Repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	
	MovieRepository movieRepository;
	
	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	
	public List<Movies> addMovies(List<Movies> movies){
		return movieRepository.saveAll(movies);
	}
	
	public List<Movies> findAllMovies(){
		return movieRepository.findAll();
	}
	
	public List<Movies> findAllMoviesByCityId(Integer cityId){
	List<Movies> moviesByCityId= movieRepository.findMoviesByCityId(cityId);	
	return moviesByCityId;
	}
	
	public List<Movies> findAllMovies(Integer movieId , Integer cityId){
		List<Movies>  allMovies = movieRepository.findAllMoviesByCityIdAndMovieId(movieId,cityId);
		return allMovies;	
	}
	
	
}
