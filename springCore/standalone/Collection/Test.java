package com.ranjan.springCore.standalone.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ranjan/springCore/standalone/Collection/config.xml");
		Person p = context.getBean("person",Person.class);
		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
		System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
		System.out.println(p.getExperience());
		System.out.println(p.getExperience().getClass().getName());
	}

}
