package com.rudraksh.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//priout out the results
		System.out.println("\nPointing to the same object:"+result);
		System.out.println("\nMemory location of theCoach:"+ theCoach);
		System.out.println("\nMemory location of alphaCoach:"+ alphaCoach);
		
		//close the context
		context.close();
		

	}

}
