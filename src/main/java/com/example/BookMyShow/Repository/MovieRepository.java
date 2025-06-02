package com.example.BookMyShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BookMyShow.Entity.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {
	
	
	@Query("SELECT m FROM Movies m JOIN Theatres t ON  m.theatreId = t.theatreId WHERE t.cityId = :cityId")
	List<Movies> findMoviesByCityId(Integer cityId);
	
//	@Query("SELECT m FROM Movies m JOIN Shows s ON m.movieId = s.movieId WHERE  ")
//	List<Movies> findAllMoviesByCityIdAndMovieId(Integer movieId, Integer cityId);
	
}
