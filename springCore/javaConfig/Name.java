package com.ranjan.springCore.javaConfig;

import org.springframework.stereotype.Component;

@Component
public class Name {
	private String fname;
	private String lname;

	public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lname=" + lname + "]";
	}
	
	

}