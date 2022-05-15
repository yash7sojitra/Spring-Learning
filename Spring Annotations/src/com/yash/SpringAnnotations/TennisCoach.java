package com.yash.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("TennisCoach: Inside the Constructor");
	}

//	@Autowired
//	public void doSomething(FortuneService fortuneService) {
//		System.out.println("TennisCoach: Inside the doSomething() Method");
//		this.fortuneService = fortuneService;
//	}


	@Override
	public String getDailyWorkout() {
		return "Practice your Backhand Volley";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
