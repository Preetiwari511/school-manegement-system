package com.sms.service;

import java.util.List;

import com.sms.entity.Student;

public interface TeacherService {
	public List<Student> showStudentList(String className);
}
