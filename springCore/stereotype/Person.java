package com.ranjan.springCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	@Value("Ranjan Jha")
	private String name;
	@Value("21")
	private int age;
	@Value("#{friend}")
	private List<String> friends;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", friends=" + friends + "]";
	}
	
}
