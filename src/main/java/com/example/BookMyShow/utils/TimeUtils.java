package com.example.BookMyShow.utils;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
	
	 private TimeUtils() {
	        throw new UnsupportedOperationException("Utility class cannot be instantiated");
	 }

	 public static String extractDate(Timestamp timestamp) {
		 LocalDateTime date = timestamp.toLocalDateTime();
		 return date.toLocalDate().toString();
		 }
	 
	 public static String extractTime(Timestamp timestamp) {
		 LocalDateTime time = timestamp.toLocalDateTime();
		 return time.toLocalTime().toString();
	 }
}
