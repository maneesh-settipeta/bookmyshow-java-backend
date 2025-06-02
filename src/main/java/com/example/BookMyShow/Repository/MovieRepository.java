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
	
	@Query("SELECT s FROM Shows s JOIN FETCH s.movie m WHERE s.cityId = :cityId AND s.movie.movieId = :movieId")
	List<Movies> findAllMoviesByCityIdAndMovieId(Integer movieId, Integer cityId);
	
}
