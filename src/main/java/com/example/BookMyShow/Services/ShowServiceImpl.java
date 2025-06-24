package com.example.BookMyShow.Services;

import java.util.List;

import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.BookMyShow.Entity.Shows;
import com.example.BookMyShow.Repository.ShowRepository;

@XSlf4j
@Service
public class ShowServiceImpl implements ShowService{

	private static final Logger log = LoggerFactory.getLogger(ShowServiceImpl.class);
	ShowRepository showRepository;
	
	public ShowServiceImpl(	ShowRepository showRepository) {
		this.showRepository = showRepository;
	}
	
	public List<Shows> addShows(List<Shows> shows){
		return showRepository.saveAll(shows);
	}
	
	public List<Shows> findAllShows(){
		System.out.println("findAllShowsService");
    log.info("findAllShowsService");
		return showRepository.findAll();
	}
	
	public List<Shows> updateShows(List<Shows> shows){
		return showRepository.saveAll(shows);
	}
	
	
}
