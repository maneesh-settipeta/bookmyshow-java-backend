package com.example.BookMyShow.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Theatres;
import com.example.BookMyShow.Repository.TheatreRepository;
import com.example.BookMyShow.dto.TheatreMovieUpdateRerquest;


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
	
	
	public void updateMoviesIdByTheatreId(List<TheatreMovieUpdateRerquest> theatresMovieUpdateRequest) {
		for(TheatreMovieUpdateRerquest theatres : theatresMovieUpdateRequest) {
			int updated =theatreRepository.updateMovieIdByTheatreId(theatres.getMovieId(),theatres.getTheatreId());
			System.out.println(updated);
		}
	}
	
	public void updateMovieIdByTheatreIdService(TheatreMovieUpdateRerquest theatreMovieUpdateRequest) {
		System.out.println(theatreMovieUpdateRequest.getTheatreId()+"40"+theatreMovieUpdateRequest.getMovieId());
		int updated =theatreRepository.updateMovieIdByTheatreId(theatreMovieUpdateRequest.getMovieId(),theatreMovieUpdateRequest.getTheatreId());
		System.out.println(updated);
	}
	
	
}
