package com.sms.service;

import com.sms.entity.Classes;
import com.sms.entity.Teacher;

public interface ClassService {
	public Classes getClass(String className);
	public Integer getTotalStrength(); 
	public void setClassTeacher(Teacher teacher,Classes classes);
	
}
