package com.ranjan.springCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	private Name name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside default contructor of Student");
	}
	
	public Student(Name name) {
		super();
		this.name = name;
		System.out.println("Inside contructor of Student");
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
		System.out.println("Setter method of student");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	

}
