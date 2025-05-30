package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Entity.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer> {
	
}
