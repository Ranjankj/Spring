package com.ranjan.springCore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		Person p = context.getBean("person",Person.class);
		System.out.println(p);
		
	}

}
