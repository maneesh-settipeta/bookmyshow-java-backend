package com.example.BookMyShow.Services;

import java.util.ArrayList;
import java.util.List;

import com.example.BookMyShow.Entity.Cities;

public interface CityService {

	public ArrayList<Cities> addCities(ArrayList<Cities> cities);
	public List<Cities> findAllCities();
}
