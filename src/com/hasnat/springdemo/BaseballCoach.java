package com.hasnat.springdemo;

public class BaseballCoach implements Coach {
	
	private Tips dailyTip;
	
	public BaseballCoach(Tips theTip) {
		this.dailyTip = theTip;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Bat daily.";
	}

	@Override
	public String tipOfTheDay() {
		return dailyTip.getTip();
	}
}
