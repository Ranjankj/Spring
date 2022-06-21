package com.ranjan.springCore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ranjan/springCore/autowire/annotation/config.xml");
		Student s = (Student)context.getBean("student");
		System.out.println(s);
	}

}
