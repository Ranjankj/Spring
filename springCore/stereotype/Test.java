package com.ranjan.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext con = 
				new ClassPathXmlApplicationContext("com/ranjan/springCore/stereotype/config.xml");
		Person p = con.getBean("person", Person.class);
		System.out.println(p);
	}

}
