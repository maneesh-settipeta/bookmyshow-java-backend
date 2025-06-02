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

import com.example.BookMyShow.Entity.Shows;
import com.example.BookMyShow.Services.ShowService;


@RestController
@RequestMapping("show/v1")
public class ShowsController {
	
	ShowService showService;
	
	@Autowired
	public ShowsController(ShowService showService) {
		this.showService= showService;
	}
	
	@PostMapping("/shows")
	public ResponseEntity<List<Shows>> addShows(@RequestBody List<Shows> shows){
		List<Shows> showsCreated = showService.addShows(shows);
		return ResponseEntity.ok(showsCreated);
	}
	
	@PutMapping("/shows")
	public ResponseEntity<List<Shows>> updateShowsData(@RequestBody List<Shows> shows){
		List<Shows> showsUpdated = showService.updateShows(shows);
		return ResponseEntity.ok(showsUpdated);
	}
	
	@GetMapping("/shows")
	public ResponseEntity<List<Shows>> findAllShows(){
		List<Shows> fetchAllShows = showService.findAllShows();
		return ResponseEntity.ok(fetchAllShows);
	}
	
	
//	public ResponseEntity<List<Shows>> 
	
	

}
