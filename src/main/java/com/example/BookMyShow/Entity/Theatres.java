package com.example.BookMyShow.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theatres {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer theatreId;
	private String theatreName;
	
//	@ManyToMany(mappedBy = "theatres") 
//	private List<Movies> movies;
	
	
	
	private List<Integer> movies;
	
	
//	@ManyToOne
//	@JoinColumn(name="theatre_city",referencedColumnName="city_id")
//	private Cities theatreCity;
	
	private Integer theatreCityId;
//	
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
	public Theatres() {
	
	}

	
	
	
	
}
