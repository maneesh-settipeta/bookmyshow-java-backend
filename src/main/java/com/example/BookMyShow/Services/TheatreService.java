package com.example.BookMyShow.Services;

import java.util.List;

import com.example.BookMyShow.Entity.Theatres;

public interface TheatreService {

	
	public List<Theatres> addTheatres(List<Theatres> theatres);
	public List<Theatres> findAllTheatres();
}
