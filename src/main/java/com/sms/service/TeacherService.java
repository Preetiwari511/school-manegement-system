package com.sms.service;

import java.util.List;

import com.sms.entity.Student;
import com.sms.entity.Teacher;

public interface TeacherService {
	public List<Student> showStudentList(String className);
	public Teacher getTeacher(String fullName);
}
