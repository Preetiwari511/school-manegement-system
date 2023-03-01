package com.sms.entity;

import java.util.Date;
import java.util.Set;

public class Student extends User {
	  private Integer rollNo;
	  private  Classes std;	
	public Student(Long id,Integer rollNo, String firstName, String lastName, String email, String phoneNumber, Date dateOfBirth,
			boolean active, String gender, Set<Address> addresses, Classes std) {
		super(id, firstName, lastName, email, phoneNumber, dateOfBirth, active, gender, addresses);
		this.std = std;
		this.rollNo = rollNo;
	}



	public Classes getStd() {
		return std;
	}

	public void setStd(Classes std) {
		this.std = std;
	}


	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}


	@Override
	public String toString() {
		return "Student [std=" + std + ", id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", email="
				+ getEmail() + ", phoneNumber=" + getPhoneNumber() + ", dateOfBirth=" + getDateOfBirth() + ", active=" + isActive()
				+ ", gender=" + getGender() + ", addresses=" + getAddresses() + ", rollNo=" + rollNo + "]";
	}

	
	 

}
