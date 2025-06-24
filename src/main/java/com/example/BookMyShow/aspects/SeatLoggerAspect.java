package com.example.BookMyShow.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.util.logging.Logger;



@Component
@Aspect
public class SeatLoggerAspect {

 Logger logger = Logger.getLogger(getClass().getName());

 @Before("execution(* com.example.BookMyShow.Services.SeatServiceImpl.findSeatsByShowIdService(..))")
 public void seatLogs(){
     logger.info("fetchSeatsApiTriggred");
 }

 @After("execution(* com.example.BookMyShow..*(..))")
    public void showLogs(JoinPoint jp){
        logger.info(" all logs after" +jp.getSignature().getName());
     logger.info(" all logs after" +jp.getArgs().toString());
    }

    @Before("execution(* com.example.BookMyShow.Services.ShowServiceImpl.findAllShows(..))")
    public void showLogs1(){
        logger.info("before aspect - fetchShowApiTriggred");
    }


    @Around("execution(* com.example.BookMyShow.Services.MovieServiceImpl.findAllMoviesByMovieIdAndCityId(..))")
    public Object movieLogs(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("MovieApiTriggred");
        Object result = joinPoint.proceed();
        logger.info("MovieApiTriggred");
        return result;
    }
}
