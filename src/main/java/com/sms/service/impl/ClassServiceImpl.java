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
	public void setClassTeacher(Teacher teacher, Classes classes) {
		//Set<Classes> classesSet = Application.CLASSES;
		for(Classes obj: Application.CLASSES) {
			if(obj.equals(classes)) {
				obj.setClassTeacher(teacher);
				System.out.println("The Class Teacher of "+ classes.getName()+ " is "+ classes.getClassTeacher().getFullName());
			}
		}
		
	}

}
