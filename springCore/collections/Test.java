package com.ranjan.springCore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ranjan/springCore/collections/empConfig.xml");
		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
	}

}
