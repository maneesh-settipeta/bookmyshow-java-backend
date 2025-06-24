package com.example.BookMyShow.exceptions;

public class SeatsNotFoundException extends  RuntimeException{


    public SeatsNotFoundException(String seatsNotFoundMessage){
        super(seatsNotFoundMessage);
    }
}
