package com.ranjan.springCore.javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Value("#{new com.ranjan.springCore.javaConfig.Name('Ranjan', 'Jha')}")
	private Name name;
	
	@Value("21")
	private int age;
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Name name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
