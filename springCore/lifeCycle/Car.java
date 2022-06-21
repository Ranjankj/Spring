package com.ranjan.springCore.lifeCycle;


/*this class is made for implementing the life cycle methods of bean using xml file*/


public class Car {
	private String name;
	private int wheel;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel + "]";
	}
	
	public void init() {
		System.out.println("in init: Car");
	}
	
	public void destroy() {
		System.out.println("in destroy: Car");
	}
	
	

}
