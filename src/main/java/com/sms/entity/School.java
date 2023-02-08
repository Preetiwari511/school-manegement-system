package com.sms.entity;

public final class School {
	public String name;
	public String address;
	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "School [name=" + name + ", Address=" + address + "]";
		
	}
	
	
	
}
