package com.hasnat.springdemo;

public class DailyTip implements Tips{
	
	@Override
	public String getTip() {
		return "CHECK the Tips daily. (that's a tip!)";
	}
}
