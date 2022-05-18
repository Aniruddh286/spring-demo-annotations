package com.rudraksh.springdemoannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String[] data = {
			"Jay Swaminarayan",
			"Jay Yogeshwar",
			"Jay Mataji",
			"Om namah Shivay"
	};
	
	//create random number generator
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length); //creating random number based on the size of the array
		String theFortune = data[index];
		
		
		return theFortune;
	}

}
