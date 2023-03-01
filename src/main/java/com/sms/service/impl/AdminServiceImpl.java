package com.sms.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import com.sms.config.Application;
import com.sms.entity.Classes;
import com.sms.entity.Student;
import com.sms.entity.Subject;
import com.sms.entity.Teacher;
import com.sms.service.AdminService;

public class AdminServiceImpl implements AdminService{

	@Override
	public void allotTeacher(List<String> classTeacherData) {
		Set<Classes> allotingClasses = Application.CLASSES;
		String allotingClass = classTeacherData.get(0);
		for(Classes obj:allotingClasses) {
			if(obj.getName().equalsIgnoreCase(allotingClass)){
			}
		}
	}



	@Override
	public Set<Subject> findSubject(String teacher) {
		Set<Teacher> teachers = Application.TEACHER;
		Iterator<Teacher> itr = teachers.iterator();
		while(itr.hasNext()) {
			Teacher currentTeacher = itr.next();
			if(currentTeacher.getFirstName().equalsIgnoreCase(teacher)) {
				return currentTeacher.getSubject();
			}
		}
		return null;
	
	}
}
