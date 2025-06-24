package com.glenwood.glaceemr.server.application.models;

import java.sql.Timestamp;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "seats")
public class Seats {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="seat_id")
	private Integer seatId;

	@Column(name="show_id")
	private Integer showId;

	@Column(name="seat_number")
	private String seatNumber;

	@Column(name="seat_row")
	private String seatRow;

	@Column(name="seat_status")
	private String seatStatus;
}