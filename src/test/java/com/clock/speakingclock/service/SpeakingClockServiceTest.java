package com.clock.speakingclock.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.clock.speakingclock.util.ClockUtils;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SpeakingClockServiceTest {

	@InjectMocks
	ClockService ClockService;

	@Mock
	ClockUtils util;

	@Test
	public void getTime() {
		
		String time = "It's MidDay";
		try (MockedStatic mock = mockStatic(ClockUtils.class)) {
			mock.when(() -> ClockUtils.printTimeInWords(anyInt(), anyInt())).thenReturn(time);
			
			assertEquals(time,ClockUtils.printTimeInWords(12, 00));
		}
	}
	
	
}
