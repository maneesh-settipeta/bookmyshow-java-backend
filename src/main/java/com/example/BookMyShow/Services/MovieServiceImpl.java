package com.example.BookMyShow.Services;

import java.sql.Timestamp;
import com.example.BookMyShow.utils.TimeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.hibernate.mapping.Set;
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
	    
	    
	    TheatreShowDto movieInfo = new TheatreShowDto(
	    		movieShowsResponse.getMovieId(),
	    		movieShowsResponse.getMovieName(), 
	    		movieShowsResponse.getCityName());
	    
	    List<MovieShowsDto> moviesList = new ArrayList<>();
	    HashMap<Integer, HashMap<String, HashMap<String,Integer>>> theatreShowsList = new HashMap<>();
	    System.out.println(theatreShowsList + " 60 theatreShowsList");
	    
	    
	    for (MovieShowsResponse showsData : results) {
	    	
	    	Integer theatreId = showsData.getTheatreId();
	    	Integer showId = showsData.getShowId();
	    	String theatreName = showsData.getTheatreName();
	    	System.out.println(theatreName);
	    	
	    	String date = TimeUtils.extractDate(showsData.getShowTime());
	    	String time = TimeUtils.extractTime(showsData.getShowTime());
	    	
	    	String dateAndTime = date+" "+time;
	    	System.out.println(dateAndTime);
	    	
	    	HashMap<String,HashMap<String, Integer>> NumberOfShows = new HashMap<>();
	    	System.out.println(NumberOfShows + " 75 NumberOfShows");
	    	HashMap<String, Integer> showTimes = new HashMap<>();
	    	System.out.println("ShowTimes 77" + showTimes);
	    	
	    	if(theatreShowsList.containsKey(theatreId)) {
	    		
	    		HashMap<String,HashMap<String,Integer>> theatreDatesShowList = theatreShowsList.get(theatreId);
	    		
	    		if(theatreDatesShowList.containsKey(date)) {
	    			showTimes = theatreDatesShowList.get(date);
	    			showTimes.put(time, showId);
	    			theatreShowsList.get(theatreId).put(date, showTimes);
	    		}
	    		else {
	    			showTimes.put(time, showId);
	    			theatreDatesShowList.put(date, showTimes);
	    			theatreShowsList.put(theatreId, theatreDatesShowList);
	    		}		
	    	}
	    	else {
	    		
	    		HashMap<String,HashMap<String, Integer>> showsList = new HashMap<>();
	    		showTimes.put(time, showId);
	    		showsList.put(date, showTimes);
	    		System.out.println(showsList+ " Showslist");
	    		theatreShowsList.put(theatreId, showsList);		
	    	}
	    			    	
	    }   
	    
	    HashSet<Integer> theatreIds = new HashSet<>();
	    
	    for(MovieShowsResponse showsData : results) {
	    	if(!theatreIds.contains(showsData.getTheatreId())) {
	    		MovieShowsDto movieShowsDto = new MovieShowsDto();
	    		System.out.println(movieShowsDto.getTheatreName());
	    		System.out.println(theatreShowsList.get(showsData.getTheatreId()));
	    		movieShowsDto.setTheatreId(showsData.getTheatreId());
	    		movieShowsDto.setTheatreName(showsData.getTheatreName());
	    		movieShowsDto.setShowTimes(theatreShowsList.get(showsData.getTheatreId()));
	    		moviesList.add(movieShowsDto);
	    		movieInfo.addMovieShows(moviesList);
	    		theatreIds.add(showsData.getMovieId());
	    	}
	    }
	    
	    return movieInfo;   	    
	}
}
