package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BookMyShow.Entity.Theatres;

import jakarta.transaction.Transactional;

@Repository
public interface TheatreRepository extends JpaRepository<Theatres, Integer> {
	
	@Modifying
	@Transactional
	@Query("UPDATE Theatres t SET t.movieId = :movieId WHERE t.theatreId = :theatreId")
	int updateMovieIdByTheatreId(@Param("movieId") Integer movieId , @Param("theatreId") Integer theatreId);
}
