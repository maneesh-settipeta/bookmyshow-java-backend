package com.example.BookMyShow.Services;

import java.util.List;

import com.example.BookMyShow.Entity.Shows;

public interface ShowService {
	public List<Shows> addShows(List<Shows> shows);
	public List<Shows> findAllShows();
	public List<Shows> updateShows(List<Shows> shows);

}
