package com.clock.speakingclock.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.clock.speakingclock.entity.Timer;
import com.clock.speakingclock.service.ClockService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SpeakingClockControllerTest {

	@InjectMocks
	SpeakingClockController speakingClockController;

	@Mock
	ClockService clockService;

	@Test
	public void getTimeTest() {
		String timeInWords = "It's twelve twenty one";
		Timer time=new Timer();
		time.setHours(12);
		time.setMins(21);
		int h=time.getHours();
		int m=time.getMins();
		when(clockService.getTime(h,m)).thenReturn(timeInWords);
		ResponseEntity<String> currentTime = speakingClockController.getCurrentTime(time);
		assertThat(currentTime).isEqualTo(timeInWords);
	}
	
	
}
