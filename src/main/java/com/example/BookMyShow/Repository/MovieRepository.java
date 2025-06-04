package com.example.BookMyShow.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.dto.MovieShowsResponse;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {
	
	
	@Query("SELECT m FROM Movies m JOIN Theatres t ON  m.theatreId = t.theatreId WHERE t.cityId = :cityId")
	List<Movies> findMoviesByCityId(Integer cityId);
	
//	@Query("SELECT s.showTime, m FROM Movies m JOIN Shows s ON m.movieId = s.movieId WHERE s.cityId = :cityId AND s.movieId = :movieId")
//	List<Movies> findAllMoviesByCityIdAndMovieId(Integer movieId, Integer cityId);
//
//	@Query("SELECT new com.example.BookMyShow.dto.MovieShowsResponse(movie.movieId, movie.movieName, show.showTime, show.showId, theatre.theatreId, theatre.theatreName, city.cityName) " +
//		       "FROM Movies movie " +
//		       " JOIN Shows show ON movie.movieId = show.movieId " +
//		       " JOIN Theatres theatre ON movie.movieId = theatre.movieId " +
//		       " JOIN City city ON show.cityId = city.cityId " +
////		       " JOIN Seats seats ON s.showId = seats.showId " +  
//		       " WHERE show.movieId = :movieId AND show.cityId = :cityId")
	
	@Query("SELECT new com.example.BookMyShow.dto.MovieShowsResponse(" +
		       " m.movieId, m.movieName, s.showTime, s.showId , t.theatreId , t.theatreName , c.cityName)" +  
		       " FROM Movies m " +
		       "JOIN Shows s ON m.movieId = s.movieId " +
		       "JOIN Theatres t ON s.theatreId = t.theatreId " +
		       "JOIN City c ON s.cityId = c.cityId " +
		       "WHERE s.movieId = :movieId AND s.cityId = :cityId")
		List<MovieShowsResponse> findAllMoviesByCityIdAndMovieId(Integer movieId, Integer cityId);
}
