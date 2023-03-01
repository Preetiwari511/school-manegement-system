package com.sms.service;

import java.util.List;
import java.util.Set;

import com.sms.entity.Subject;

public interface AdminService {
	public void allotTeacher(List<String>classTeacherData);
	public Set<Subject> findSubject(String teacher);
}
