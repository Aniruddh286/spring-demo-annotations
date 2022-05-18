package com.rudraksh.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.rudraksh.springdemoannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	//Adding dependency
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	//name of the method will be the bean id
	public Coach swimCoach() {   
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
		
		return mySwimCoach;
	}
	

}
