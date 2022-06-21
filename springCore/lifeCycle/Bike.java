package com.ranjan.springCore.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/*this class is made for implementing the life cycle methods of bean using interface file*/




public class Bike implements InitializingBean,DisposableBean{
	private int wheels;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Bike [wheels=" + wheels + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("int destroy: Bike");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in init : Bike");
	}
	
	

}
