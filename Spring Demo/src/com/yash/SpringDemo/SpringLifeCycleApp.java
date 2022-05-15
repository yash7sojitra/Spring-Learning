package com.yash.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		context.close();
	}
}
