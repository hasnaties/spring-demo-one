package com.hasnat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		TrackCoach theCoach = context.getBean("trackCoach", TrackCoach.class);
		
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getRollno());
		
		context.close();
	}

}
