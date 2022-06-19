package com.ranjan.springCore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String name;
	private List address;
	private Set phones;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List address, Set phones) {
		super();
		this.name = name;
		this.address = address;
		this.phones = phones;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getAddress() {
		return address;
	}
	public void setAddress(List address) {
		this.address = address;
	}
	public Set getPhones() {
		return phones;
	}
	public void setPhones(Set phones) {
		this.phones = phones;
	}
	
	
	
	

}
