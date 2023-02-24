package com.sms.service;

import java.util.List;

import com.sms.entity.Subject;

public interface AdminService {
	public void allotTeacher(List<String>classTeacherData);
	public Subject findSubject(String teacher);
}
