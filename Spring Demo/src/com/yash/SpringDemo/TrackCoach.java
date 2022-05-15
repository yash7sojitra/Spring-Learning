package com.yash.SpringDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 5km";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Just do it " +  fortuneService.getFortune();
	}

}
