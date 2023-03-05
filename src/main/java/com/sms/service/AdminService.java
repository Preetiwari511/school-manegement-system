package com.sms.service;

import java.util.Set;

import com.sms.entity.Subject;

public interface AdminService {
	public void allotTeacher(String classes,String teacher);
	public Set<Subject> findSubject(String teacher);

}
