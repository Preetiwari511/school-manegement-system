package com.sms.service;

import java.util.Set;
import com.sms.entity.Classes;
import com.sms.entity.Subject;


public interface AdminService {
	public void allotClassTeacher(String classes,String teacher);
	public Set<Subject> findSubject(String teacher);
	public Classes allotSubjectTeacherToClass(String teacher,int subjectId,String classes);
	
}
