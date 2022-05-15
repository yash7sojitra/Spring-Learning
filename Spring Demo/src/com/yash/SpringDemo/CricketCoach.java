package com.yash.SpringDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
		System.out.println("Inside the constructor.");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Setting the emailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Setting the team name");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method.");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Do fast Bowling practice for 15 mins";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
