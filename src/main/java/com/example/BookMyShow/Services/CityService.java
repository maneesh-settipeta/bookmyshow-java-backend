package com.example.BookMyShow.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.BookMyShow.Entity.City;


public interface CityService {

	public ArrayList<City> addCities(ArrayList<City> cities);
	public List<City> findAllCities();
}
