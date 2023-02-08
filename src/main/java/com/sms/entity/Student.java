package com.sms.entity;

public class Student {
	private int id;
	private String fullName;
	private int age;
	private String gender;
	private Classes std;
	
	public Student(int id, String fullName, int age, String gender, Classes std) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.std = std;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Classes getStd() {
		return std;
	}
	public void setStd(Classes std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", age=" + age + ", gender=" + gender + ", std=" + std
				+ "]";
	}

}
