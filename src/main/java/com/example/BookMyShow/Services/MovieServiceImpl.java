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
}
