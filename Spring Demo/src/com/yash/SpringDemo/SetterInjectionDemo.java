package com.yash.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println("Email Address : "+theCoach.getEmailAddress());
		System.out.println("Team name : " + theCoach.getTeam());
		context.close();
	}

}
