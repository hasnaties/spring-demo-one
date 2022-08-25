package com.hasnat.springdemo;

public class TrackCoach implements Coach {
	
	private Tips dailyTip;
	
	
	public TrackCoach(Tips tip) {
		this.dailyTip = tip;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run like a maniac.";
	}

	@Override
	public String tipOfTheDay() {
		return dailyTip.getTip();
	}

}
