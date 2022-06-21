package com.ranjan.springCore.autowire;

public class Person {
	private Name name;
	private int age;

	

	public Person(Name name) {
		super();
		this.name = name;
		System.out.println("Single parameter constructor");
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
		System.out.println("setter method for name");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setter method for age");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	

}
