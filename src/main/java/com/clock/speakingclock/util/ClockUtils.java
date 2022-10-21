package com.clock.speakingclock.util;

public class ClockUtils {

	public static String printTimeInWords(int h, int m) {
		String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
				"twenty seven", "twenty eight", "twenty nine", "thirty", "thirty-one", "thirty-two", "thirty-three",
				"thirty-four", "thirty-five", "thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",
				"forty-one", "forty-two", "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven",
				"forty-eight", "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four",
				"fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty" };

		if (h == 12 && m == 00)
			return " '" + "It's Midday" + " '";

		else if ((h == 00 || h == 0) && m == 00)
			return " '" + "It's Midnight" + " '";
		else if (h == 0 || h == 00)
			return " '" + "It's " + nums[12] + " " + nums[m] + " '";
		else if (h > 12 && m == 0) {
			return " '" + "It's " + nums[h - 12] + " " + " o' clock '";
		} else if (h > 12) {
			return " '" + "It's " + nums[h - 12] + " " + nums[m] + " '";
		} else if (h != 12 && h != 00 && m == 0)
			return " '" + nums[h] + " o' clock " + " '";
		else
			return " '" + "its " + nums[h] + " " + nums[m] + " '";

	}
}
