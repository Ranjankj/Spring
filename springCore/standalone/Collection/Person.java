package com.ranjan.springCore.standalone.Collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private  Map<String,String> experience;

	

	public Map<String, String> getExperience() {
		return experience;
	}

	public void setExperience(Map<String, String> experience) {
		this.experience = experience;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

}
