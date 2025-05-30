package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BookMyShow.Entity.City;

public interface CitiesRepository extends JpaRepository<City, Integer>{

}
