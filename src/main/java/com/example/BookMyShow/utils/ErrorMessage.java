package com.example.BookMyShow.utils;

public class ErrorMessage {
	
	private String message;
	private  boolean status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public ErrorMessage(String message, boolean status) {
		this.message = message;
		this.status = status;
	}

}
