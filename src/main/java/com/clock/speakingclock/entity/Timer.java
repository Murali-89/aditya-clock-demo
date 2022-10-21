package com.clock.speakingclock.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timer {

	
	
	
	
	@NotNull(message="Hours should not be empty")
	@Min(value=1,message = "Please enter the hours within 1 to 24")  
    @Max(value=24, message="Please enter the hours within 1 to 24")  
    private int hours; 
	
	@NotNull(message="Minutes should not be empty")	
	@Min(value=0,message = "Please enter the mins within 1 to 60")  
	@Max(value=60, message="Please enter the mins within 1 to 60")  
	private int mins;
}
