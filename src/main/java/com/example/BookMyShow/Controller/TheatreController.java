package com.example.BookMyShow.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Entity.Theatres;
import com.example.BookMyShow.Services.TheatreService;

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
	public ResponseEntity<String> updateMovieIdByTheatreIdController(@RequestBody Theatres theatres){
		theatreService.updateMovieIdByTheatreId(theatres);
		return ResponseEntity.ok("Theatres got updated");
		}
	
	
}
