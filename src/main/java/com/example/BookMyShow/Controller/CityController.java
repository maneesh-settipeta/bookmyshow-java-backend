package com.example.BookMyShow.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Entity.Cities;
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
	public ResponseEntity<ArrayList<Cities>> createCity(@RequestBody ArrayList<Cities> cities){
		ArrayList<Cities> savedCities = cityService.addCities(cities);
		return ResponseEntity.ok(savedCities);
	}
	
	@GetMapping("/cities")
	public ResponseEntity<List<Cities>> getAllCities(){
		System.out.println("Coming");	
		List<Cities> cities = cityService.findAllCities();
		return ResponseEntity.ok(cities);
	}
	
	@GetMapping("/")
	public String test() {
	    return "CityController is active";
	}
	
	
}
