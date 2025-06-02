package com.example.BookMyShow.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Services.MovieService;

import com.example.BookMyShow.Entity.Movies;

@RestController
@RequestMapping("/movie/v1")
public class MoviesController {
	
	
	MovieService movieService;
	
	@Autowired
	public MoviesController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@PostMapping("/movies")
	public ResponseEntity<List<Movies>> addMoviesController(@RequestBody List<Movies> movies){
		List<Movies> addMovies = movieService.addMovies(movies);
		return ResponseEntity.ok(addMovies);
	}
	
	@GetMapping("/movies")
	public ResponseEntity<List<Movies>> getMoviesController(){
		List<Movies> findAllMovies = movieService.findAllMovies();
		return ResponseEntity.ok(findAllMovies);
	}
	
	@GetMapping("/movie/explore")
	public ResponseEntity<List<Movies>> findMoviesByCityController(@RequestParam("cityId") Integer cityId){
		List<Movies> findMovies = movieService.findAllMoviesByCityId(cityId);
		return ResponseEntity.ok(findMovies);
	}
	
	@GetMapping("/explore/search")
	public ResponseEntity<List<Movies>> findAllMoviesController(@RequestParam("movieId") Integer movieId, @RequestParam("cityId")Integer cityId){
		List<Movies> findAllMovies = movieService.findAllMovies(movieId,cityId);
		return ResponseEntity.ok(findAllMovies);
	}
	
	

}
