package com.example.BookMyShow.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.City;
import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.Repository.CitiesRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CitiesRepository citiesRepository;
	
	public ArrayList<City> addCities(ArrayList<City> cities) {
		return (ArrayList<City>) citiesRepository.saveAll(cities);
	}
	
	public List<City> findAllCities(){
		return citiesRepository.findAll();
	}
		

}
