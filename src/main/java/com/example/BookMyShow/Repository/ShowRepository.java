package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookMyShow.Entity.Shows;


@Repository
public interface ShowRepository extends JpaRepository<Shows, Integer> {
	

}
