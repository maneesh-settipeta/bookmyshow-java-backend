package com.example.BookMyShow.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Entity.City;
import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.Services.CityService;

@RestController
@RequestMapping("/movies/v1")
public class CityController {
	
    
	CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}
	
	@PostMapping("/createCities")
	public ResponseEntity<ArrayList<City>> createCity(@RequestBody ArrayList<City> cities){
		ArrayList<City> savedCities = cityService.addCities(cities);
		return ResponseEntity.ok(savedCities);
	}
	
	@GetMapping("/cities")
	public ResponseEntity<List<City>> getAllCities(){
		System.out.println("Coming");	
		List<City> cities = cityService.findAllCities();
		return ResponseEntity.ok(cities);
	}
	
	

	
	
	
	
	
}
