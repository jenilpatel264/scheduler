package com.example.demo.service;

import java.sql.Timestamp;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.REPO.studentDto;
import com.example.demo.entiry.Student;

import ch.qos.logback.classic.Logger;

@EnableScheduling
@Component
public class scheduler {
	
	public static final Logger LOGGER=(Logger) LoggerFactory.getLogger(scheduler.class);
	
	@Autowired studentDto dWto;
	
	@Scheduled(cron = "* * * * * *")
	public void markExpire()
	{
		
		LOGGER.info("WELCOME TO MY CHANNLE");
		Timestamp timestamp=new Timestamp(System.currentTimeMillis());
		LOGGER.info("TIMESTAMP "+timestamp);
		System.out.println("WELCOME TO MY CHANNEL");
	}
	


}
