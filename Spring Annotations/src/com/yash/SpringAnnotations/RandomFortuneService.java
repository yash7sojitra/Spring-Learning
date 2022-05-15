package com.yash.SpringAnnotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	String[] data = { 
			"Random String 1",
			"Random String 2",
			"Random String 3",
	};
	
	private Random random = new Random();
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		
		return data[index];
	}

}
