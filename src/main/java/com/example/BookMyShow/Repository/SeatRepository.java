package com.example.BookMyShow.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.example.BookMyShow.Entity.Movies;
import com.example.BookMyShow.Entity.Seats;

@Repository
public interface SeatRepository extends JpaRepository<Seats, Integer>{

	
	
}
