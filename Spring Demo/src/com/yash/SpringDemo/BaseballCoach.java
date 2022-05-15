package com.yash.SpringDemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService thefortuneService) {
		System.out.println("Inside the Constructor");
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "2 Hour Batting Practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("In the method: doMyStartupStuff");
	}
	public void doMyCleanupStuff() {
		System.out.println("In the method: doMyCleanupStuff");
	}
}
