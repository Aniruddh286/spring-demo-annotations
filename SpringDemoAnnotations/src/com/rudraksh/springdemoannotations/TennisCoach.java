package com.rudraksh.springdemoannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") //Spring will automatically register this bean
@Component //if we are not specifying the bean id here, spring will automatically generates it with the class name with first letter smaller
//@Scope("prototype")
public class TennisCoach implements Coach {

	//field injection
	@Autowired
	@Qualifier("randomFortuneService") // if more than one classes are created for an interface, use qualifier to use specific implementation (class)
	private FortuneService fortuneService;
	
	/* constructor injection
	 @Autowired
	public TennisCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit hard!";
	}
	/* setter injection
	 @Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("\nInside domyStartupStuff");
	}
	
	@PreDestroy
	public void doMyDestroyStuff() {
		System.out.println("\nInside domyDestroyStuff");
	}

}
