package com.clock.speakingclock.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clock.speakingclock.entity.Timer;
import com.clock.speakingclock.service.ClockService;

@RestController
@RequestMapping("/api/clock")
public class SpeakingClockController {

	@Autowired
	public ClockService clockService;

	Logger log = LoggerFactory.getLogger(SpeakingClockController.class);

	@PostMapping("/currentTime")
	public ResponseEntity<String> getCurrentTime(@RequestBody @Valid Timer timer) {

		log.info("Inside getCurrentTime method of SpeakingClockController");

		int hours = timer.getHours();
		int mins = timer.getMins();
		String time = clockService.getTime(hours, mins);
		log.info("Exiting getCurrentTime method of SpeakingClockController");
		return new ResponseEntity<>(time, HttpStatus.OK);
	}

}
