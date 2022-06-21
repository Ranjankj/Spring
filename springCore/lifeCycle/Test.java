package com.ranjan.springCore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ranjan/springCore/lifeCycle/config.xml");
		
		
		
//		Car c = (Car)context.getBean("car");
//		System.out.println(c);
		
//		Bike b = (Bike)context.getBean("bike");
//		System.out.println(b);
		
		Truck t = (Truck)context.getBean("t1");
		System.out.println(t);
		
		
		
		// registering shutdown hook this method is present in 
		//AbtractApplicationContext
		// if this is not register than the destroy method will not be called
		context.registerShutdownHook();
	}

}
