package com.hasnat.springdemo;


public class TrackCoach implements Coach {
	
	private Tips dailyTip;
	private String name;
	private int rollno;
	
	
	public TrackCoach() {
		
	}
	
	public void setTip(Tips tip) {
		this.dailyTip = tip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run like a maniac.";
	}

	@Override
	public String tipOfTheDay() {
		return dailyTip.getTip();
	}
	
	//Bean-Init
	public void beanInit() {
		System.out.println("Bean started!");
	}
	//Bean-end
	public void beanEnd() {
		System.out.println("Bean ended!");
	}

}
