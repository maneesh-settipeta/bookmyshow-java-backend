package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Entity.Theatres;

public interface TheatreRepository extends JpaRepository<Theatres, Integer> {

}
