package com.sms.service.impl;

import java.util.Set;

import com.sms.config.Application;
import com.sms.entity.Classes;
import com.sms.entity.Teacher;
import com.sms.service.ClassService;

public class ClassServiceImpl implements ClassService{

	@Override
	public Classes getClass(String className) {
		Set<Classes> classes = Application.CLASSES;
		for(Classes obj:classes) {
			if(obj.getName().equalsIgnoreCase(className)) {
				return obj;
			}
		}
		return null;
	}

	@Override
	public Integer getTotalStrength() {
		Integer sum=0;
		Set<Classes> classes = Application.CLASSES;
		for(Classes obj: classes) {
			sum = sum+ obj.getStrength();
		}
		return sum;
	}
	
	@Override
	public Integer getTotalStrength(String className) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getFemaleStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer getFemaleStudents(String className) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setClassTeacher(Teacher teacher, Classes classes) {
		 classes.setClassTeacher(teacher);
	}
		
}


