package com.example.BookMyShow.Services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.dto.MovieShowsDto;
import com.example.BookMyShow.dto.MovieShowsResponse;
import com.example.BookMyShow.dto.TheatreShowDto;

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
	
	
	public TheatreShowDto findAllMoviesByMovieIdAndCityId(Integer movieId, Integer cityId) {
		System.out.println(movieId+" "+cityId);
	    List<MovieShowsResponse> results = movieRepository.findAllMoviesByCityIdAndMovieId(movieId, cityId);
	    System.out.println(results);
	    if (results.isEmpty()) return null;
	    MovieShowsResponse movieShowsResponse = results.get(0);
	    
	  
	    
//	    TheatreShowDto movieInfo = new TheatreShowDto();
//	    movieInfo.setMovieId(movieShowsResponse.getMovieId());
	    
	    TheatreShowDto movieInfo = new TheatreShowDto(
	    		movieShowsResponse.getMovieId(),
	    		movieShowsResponse.getMovieName(), 
	    		movieShowsResponse.getCityName());
	    
	    for (MovieShowsResponse showsData : results) {
	    	MovieShowsDto movieShowDto = new MovieShowsDto(
	    			showsData.getTheatreId(),
	    			showsData.getTheatreName(), 
	    			showsData.getShowTime(),
	    			showsData.getShowId());
	    movieInfo.addMovieShows(movieShowDto);
	    }    
	    return movieInfo;   	    
	}
}
