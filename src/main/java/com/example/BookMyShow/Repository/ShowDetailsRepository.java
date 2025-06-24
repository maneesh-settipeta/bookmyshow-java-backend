package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BookMyShow.Entity.Shows;
import com.example.BookMyShow.dto.ShowDetailsDto;

@Repository
public interface ShowDetailsRepository extends JpaRepository<Shows, Integer> {

    @Query("SELECT new com.example.BookMyShow.dto.ShowDetailsDto( " +
           "m.movieId, m.movieName, " +
           "t.theatreId, t.theatreName, " +
           "s.showId, s.showTime, " +
           "c.cityName) " +
           "FROM Shows s " +
           "JOIN Movies m ON s.movieId = m.movieId " +
           "JOIN Theatres t ON s.theatreId = t.theatreId " +
           "JOIN City c ON t.cityId = c.cityId " +
           "WHERE s.showId = :showId")
    ShowDetailsDto findShowDetailsRepository(Integer showId);
}
