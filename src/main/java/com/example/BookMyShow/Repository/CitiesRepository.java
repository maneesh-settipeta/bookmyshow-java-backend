package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookMyShow.Entity.City;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer>{

}
