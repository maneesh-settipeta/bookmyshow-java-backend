package com.example.BookMyShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Entity.Theatres;
import com.example.BookMyShow.Services.TheatreService;
import com.example.BookMyShow.dto.TheatreMovieUpdateRerquest;

@RestController
@RequestMapping("/theatre/v1")
public class TheatreController {
	
	TheatreService theatreService;
	
	@Autowired
	public TheatreController(TheatreService theatreService) {
		this.theatreService = theatreService;
	}
	
	@PostMapping("/theatres")
	public ResponseEntity<List<Theatres>> addTheatreController(@RequestBody List<Theatres> theatres){
		System.out.println("29 Controller");
		List<Theatres> createTheatres = theatreService.addTheatres(theatres);
		return ResponseEntity.ok(createTheatres);
		}
	
	@GetMapping("/theatres")
	public ResponseEntity<List<Theatres>> getTheatres(){
		List<Theatres> getTheatres = theatreService.findAllTheatres();
		return ResponseEntity.ok(getTheatres);
	}
	@PutMapping("/theatres")
	public ResponseEntity<String> updateMovieIdByTheatresIdController(@RequestBody List<TheatreMovieUpdateRerquest> theatreMovieUpdateRequest){
		theatreService.updateMoviesIdByTheatreId(theatreMovieUpdateRequest);
		return ResponseEntity.ok("Theatres got updated");
	}
	
	@PutMapping("/theatre")
	public ResponseEntity<String> updateMovieIdByTheatreController(@RequestBody TheatreMovieUpdateRerquest theatreMovieUpdateRequest){
		theatreService.updateMovieIdByTheatreIdService(theatreMovieUpdateRequest);
		return ResponseEntity.ok("Theatre got updated");
	}
	
	
}
