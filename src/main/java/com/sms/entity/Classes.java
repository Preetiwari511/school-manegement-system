package com.sms.entity;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Classes {
	private String name;
	private int strength;
	private Teacher classTeacher;
	Map<Subject, Teacher> subjectTeacher = new LinkedHashMap<>();
	
	public Map<Subject, Teacher> getSubjectTeacher() {
		return subjectTeacher;
	}
	public void setSubjectTeacher(Map<Subject, Teacher> subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}
	public Teacher getClassTeacher() {
		return classTeacher;
	}
	public void setClassTeacher(Teacher classTeacher) {
		this.classTeacher = classTeacher;
	}
	public Classes(String name, int strength) {
		super();
		this.name = name;
		this.strength = strength;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getStrength() {
		return strength;
	}
	public final void setStrength(int strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Classes [name=" + name + ", strength=" + strength + ", classTeacher=" + classTeacher
				+ ", subjectTeacher=" + subjectTeacher + "]";
	}
	
	
	

}
