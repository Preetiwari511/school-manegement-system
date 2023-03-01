package com.sms.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

public final class Teacher extends User {
	private Set<Subject> subjects;
	
	

	public Teacher(Long id, String firstName, String lastName, String email, String phoneNumber, Date dateOfBirth,
			boolean active, String gender, Set<Address> addresses, Set<Subject>subjects ) {
		super(id, firstName, lastName, email, phoneNumber, dateOfBirth, active, gender, addresses);
		this.subjects = subjects;
	}

	public final Set<Subject> getSubject() {
		return subjects;
	}

	public final void setSubject(Set<Subject> subject) {
		this.subjects = subject;
	}

	@Override
	public String toString() {
		return "Teacher [subjects=" + subjects + ", id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName()
				+ ", email=" + getEmail() + ", phoneNumber=" + getPhoneNumber() + ", dateOfBirth=" + getDateOfBirth() + ", active="
				+ isActive() + ", gender=" + getGender() + ", addresses=" + getAddresses() + "]";
	}


	
	
	
	
	

}
