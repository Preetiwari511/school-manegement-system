package com.sms.service.impl;

import java.util.Set;

import com.sms.config.Application;
import com.sms.entity.Subject;
import com.sms.service.SubjectsService;

public class SubjectsServiceImpl implements SubjectsService  {
	@Override
	public Subject getSubjects(int id) {
		Set<Subject> subjects = Application.SUBJECTS;
		for(Subject obj:subjects) {
			if(obj.getId().equals(id)){
				return obj;
			}		
		}
		return null;

	}
}
