package com.example.BookMyShow.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Cities;
import com.example.BookMyShow.Repository.CitiesRepository;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CitiesRepository citiesRepository;
	
	public ArrayList<Cities> addCities(ArrayList<Cities> cities) {
		return (ArrayList<Cities>) citiesRepository.saveAll(cities);
	}
	
	public List<Cities> findAllCities(){
		return citiesRepository.findAll();
	}
	

}
