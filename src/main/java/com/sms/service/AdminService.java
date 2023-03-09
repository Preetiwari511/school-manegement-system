package com.sms.service;

import java.util.Set;
import com.sms.entity.Classes;
import com.sms.entity.Subject;
import com.sms.entity.Teacher;


public interface AdminService {
	public void allotClassTeacher(String classes,String teacher);
	public Set<Subject> findSubject(String teacher);
	public Classes allotSubjectTeacherToClass(String teacher,int subjectId,String classes);
	public Teacher  allotSubjectToTeacher(int subjectId,String teacher);
	public Set<Teacher> listTeachersBySubjectId(int subjectId);
	
	
}
