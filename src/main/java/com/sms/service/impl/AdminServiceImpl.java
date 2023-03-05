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
import com.sms.service.ClassService;
import com.sms.service.TeacherService;

public class AdminServiceImpl implements AdminService{

	@Override
	public Set<Subject> findSubject(String teacher) {
		Set<Teacher> teachers = Application.TEACHER;
		Iterator<Teacher> itr = teachers.iterator();
		while(itr.hasNext()) {
			Teacher currentTeacher = itr.next();
			if(currentTeacher.getFullName().equalsIgnoreCase(teacher)) {
				return currentTeacher.getSubject();
			}
		}
		return null;
	
	}

	@Override
	public void allotClassTeacher(String classes, String teacher) {
		ClassService classService = new ClassServiceImpl();
		TeacherService teacherService = new TeacherServiceImpl();
		
		Teacher classTeacher=teacherService.getTeacher(teacher);
		Classes neededClass = classService.getClass(classes);
		
		Set<Teacher> teachers = Application.TEACHER;
		Set<Classes> classesSet = Application.CLASSES;
		
		classService.setClassTeacher(classTeacher, neededClass);
	}

	@Override
	public void allotSubjectTeacherToClass(Teacher teacher, Subject subject, Classes classes) {
		
	}
}
