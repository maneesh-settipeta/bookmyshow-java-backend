package com.example.BookMyShow.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Theatres;
import com.example.BookMyShow.Repository.TheatreRepository;


@Service
public class TheatreService {

	private TheatreRepository theatreRepository;
	
	@Autowired
	public TheatreService(TheatreRepository theatreRepository) {
		this.theatreRepository = theatreRepository;	
	}
	
	public List<Theatres> addTheatres(List<Theatres> theatres){	
		return theatreRepository.saveAll(theatres);
	}
	
	public List<Theatres> findAllTheatres(){
		return theatreRepository.findAll();
				}
	
	
}
