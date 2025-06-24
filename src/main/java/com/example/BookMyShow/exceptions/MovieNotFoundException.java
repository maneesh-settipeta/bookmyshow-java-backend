package com.example.BookMyShow.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class MovieNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovieNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
