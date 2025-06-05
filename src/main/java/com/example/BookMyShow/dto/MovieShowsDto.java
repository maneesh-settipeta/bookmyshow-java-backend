package com.example.BookMyShow.dto;

import java.sql.Timestamp;
import java.util.HashMap;

public class MovieShowsDto {
	
	private Integer theatreId;
	private String theatreName;
	private HashMap<String, HashMap<String, Integer>> showTimes;
	
	
	public MovieShowsDto(int theatreId, String theatreName) {
		this.theatreId = theatreId;
		this.theatreName = theatreName;
	}
	
	public HashMap<String,HashMap<String, Integer>> getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(HashMap<String,HashMap<String,Integer>> hashMap) {
		this.showTimes = hashMap;
	}

	public MovieShowsDto() {
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

}
