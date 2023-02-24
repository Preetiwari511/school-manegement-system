package com.sms.entity;

import java.util.List;

public final class Teacher {
	public int id;
	public String name;
	public Subject subjects;
	
	public Teacher(int id, String name, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subject;
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Subject getSubject() {
		return subjects;
	}

	public final void setSubject(Subject subject) {
		this.subjects = subject;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subjects + "]";
	}

	
	
	
	
	

}
