package com.ranjan.springCore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Truck {
	private int wheel;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Truck [wheel=" + wheel + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init in truck");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy truck");
	}
	
	
}
