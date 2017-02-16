package com.cicilthomas.aws.lambda.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class TimeService {

	public String getCurrentTime() {
		 String time = "The current time is ";
		 time += new SimpleDateFormat("HH:mm")
						.format(Calendar.getInstance().getTime());		 
		 return time;
	}
}
