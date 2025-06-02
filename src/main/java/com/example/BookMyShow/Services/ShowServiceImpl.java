package com.example.BookMyShow.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Shows;
import com.example.BookMyShow.Repository.ShowRepository;

@Service
public class ShowServiceImpl implements ShowService{
	
	ShowRepository showRepository;
	
	public ShowServiceImpl(	ShowRepository showRepository) {
		this.showRepository = showRepository;
	}
	
	public List<Shows> addShows(List<Shows> shows){
		return showRepository.saveAll(shows);
	}
	
	public List<Shows> findAllShows(){
		return showRepository.findAll();
	}
	
	public List<Shows> updateShows(List<Shows> shows){
		return showRepository.saveAll(shows);
	}

}
