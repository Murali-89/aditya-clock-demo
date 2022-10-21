package com.clock.speakingclock.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.clock.speakingclock.util.ClockUtils;

@Service
public class ClockService {

	Logger log=LoggerFactory.getLogger(ClockService.class);

	public String getTime(int hours, int mins) {

		log.info("Inside getTime method of ClockService");
		String currentTime="";
		try {
		/*Date date = new Date();
		DateFormat format = new SimpleDateFormat("HHmm");
		String dt = format.format(date).toString();
		int time = Integer.valueOf(dt);
		int hours = time / 100;
		int mins = time % 100;*/
		currentTime = ClockUtils.printTimeInWords(hours, mins);
		}catch(Exception e) {
			log.info("Exception occured while parsing the current time");
		}
		log.info("Exiting getTime method of ClockService");
		return currentTime;
	}

}
