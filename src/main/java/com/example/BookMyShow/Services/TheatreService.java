package com.example.BookMyShow.Services;

import java.util.List;
import java.util.Optional;

import com.example.BookMyShow.Entity.Theatres;
import com.example.BookMyShow.dto.TheatreMovieUpdateRerquest;

public interface TheatreService {

	
	public List<Theatres> addTheatres(List<Theatres> theatres);
	public List<Theatres> findAllTheatres();
	public void updateMoviesIdByTheatreId(List<TheatreMovieUpdateRerquest> theatresMovieUpdateRequest) ;
	public void  updateMovieIdByTheatreIdService(TheatreMovieUpdateRerquest theatreMovieUpdateRequest);
}
