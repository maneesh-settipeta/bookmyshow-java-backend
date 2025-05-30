package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.BookMyShow.Entity.Theatres;

import jakarta.transaction.Transactional;

public interface TheatreRepository extends JpaRepository<Theatres, Integer> {
	
	@Modifying
	@Transactional
	@Query("UPDATE Theatres t SET t.movie_id = :movieId WHERE theatre_id = :theatreId")
	int updateMovieIdByTheatreId(Integer movieId , Integer theatreId);

}
