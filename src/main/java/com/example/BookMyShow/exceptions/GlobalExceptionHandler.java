package com.example.BookMyShow.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.BookMyShow.utils.ErrorMessage;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleMovieNotFound(MovieNotFoundException ex){
		ErrorMessage error = new ErrorMessage(ex.getMessage(),false);
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(SeatsNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleSeatsNotFoundException(SeatsNotFoundException ex){
		ErrorMessage error = new ErrorMessage(ex.getMessage(), false);
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<ErrorMessage> handleGenericException(Exception ex){
		ErrorMessage error = new ErrorMessage( ex.getMessage() , false);
		return new ResponseEntity<>(error , HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
