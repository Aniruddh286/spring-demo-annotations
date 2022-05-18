package com.rudraksh.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is the Lucky day!!";

	}

}
