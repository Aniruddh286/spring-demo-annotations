package com.rudraksh.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "This is sad Fortune service!!";
	}

}
