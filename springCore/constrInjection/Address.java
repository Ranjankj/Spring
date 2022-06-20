package com.ranjan.springCore.constrInjection;

public class Address {
	private String houseNo;
	private String locality;
	public Address(String houseNo, String locality) {
		super();
		this.houseNo = houseNo;
		this.locality = locality;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + "]";
	}
	
	
	
	

}
