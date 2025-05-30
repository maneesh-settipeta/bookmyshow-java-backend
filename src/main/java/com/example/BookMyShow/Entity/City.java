package com.example.BookMyShow.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;


@Entity
@Table(name = "city")
public class City {

	public City() {
		
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="city_city_id_seq")
	@SequenceGenerator(name ="city_city_id_seq", sequenceName="city_city_id_seq", allocationSize=1)
	@Column(name="city_id")
	private Integer cityId;

	@Column(name="city_name")
	private String cityName;
}