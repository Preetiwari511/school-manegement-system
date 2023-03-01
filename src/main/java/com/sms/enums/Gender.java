package com.sms.enums;

public enum Gender {
	MALE("Male"),FEMALE("Female");
	private String gender;
	Gender(String string) {
		this.gender = string;
	}
	
	public String getGender() {
		return this.gender;
	}
}
