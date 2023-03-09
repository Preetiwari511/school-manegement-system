package com.sms.service.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import com.sms.config.Application;
import com.sms.entity.Classes;
import com.sms.entity.Subject;
import com.sms.entity.Teacher;
import com.sms.service.AdminService;
import com.sms.service.ClassService;
import com.sms.service.SubjectsService;
import com.sms.service.TeacherService;

public class AdminServiceImpl implements AdminService {
	private ClassService classService;
	private TeacherService teacherService;
	private SubjectsService subjectsservice;

	public AdminServiceImpl() {
		this.classService = new ClassServiceImpl();
		this.teacherService = new TeacherServiceImpl();
		this.subjectsservice = new SubjectsServiceImpl();
	}

	@Override
	public Set<Subject> findSubject(String teacher) {
		Set<Teacher> teachers = Application.TEACHER;
		Iterator<Teacher> itr = teachers.iterator();
		while (itr.hasNext()) {
			Teacher currentTeacher = itr.next();
			if (currentTeacher.getFullName().equalsIgnoreCase(teacher)) {
				return currentTeacher.getSubject();
			}
		}
		return null;

	}

	@Override
	public void allotClassTeacher(String classes, String teacher) {
		Teacher classTeacher = teacherService.getTeacher(teacher);
		Classes neededClass = classService.getClass(classes);

		classService.setClassTeacher(classTeacher, neededClass);
	}

	@Override
	public Classes allotSubjectTeacherToClass(String teacher, int subjectID, String classes) {
		Teacher subjectTeacher = teacherService.getTeacher(teacher);
		Classes neededClass = classService.getClass(classes);
		Subject classSubject = subjectsservice.getSubjects(subjectID);
		neededClass.getSubjectTeacher().put(classSubject, subjectTeacher);
		return neededClass;

	}
	
	@Override
	public Teacher allotSubjectToTeacher(int subjectId, String teacher) {
		Teacher subjectTeacher = teacherService.getTeacher(teacher);
		Subject subject = subjectsservice.getSubjects(subjectId);
		subjectTeacher.getSubject().add(subject);
		return subjectTeacher;
		
	}

	@Override
	public Set<Teacher> listTeachersBySubjectId(int subjectId) {
		Set<Teacher> teachers = Application.TEACHER;
		Set<Teacher> filteredTeachers = new LinkedHashSet<Teacher>();
		for(Teacher obj : teachers) {
			for(Subject obj1 : obj.getSubject()) {
				if(obj1.getId().equals(subjectId)) {
					filteredTeachers.add(obj);
					
				}
			}
		}
		return filteredTeachers;
	}

}
