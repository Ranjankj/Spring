package com.ranjan.springCore.constrInjection;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Address address;
	private List<String> phones;
	
	public Person(String name, int id, Address address, List<String> phones) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + ", phones=" + phones + "]";
	}


}
