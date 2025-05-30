package com.example.BookMyShow.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Theatres;
import com.example.BookMyShow.Repository.TheatreRepository;


@Service
public class TheatreServiceImpl implements TheatreService {

	private TheatreRepository theatreRepository;
	
	@Autowired
	public TheatreServiceImpl(TheatreRepository theatreRepository) {
		this.theatreRepository = theatreRepository;	
	}
	
	public List<Theatres> addTheatres(List<Theatres> theatres){	
		return theatreRepository.saveAll(theatres);
	}
	
	public List<Theatres> findAllTheatres(){
		return theatreRepository.findAll();
				}
	public void updateMovieIdByTheatreId(Theatres theatres) {
		
	}
	
	
}
