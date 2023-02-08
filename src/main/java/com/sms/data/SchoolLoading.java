package com.sms.data;

import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.School;

public final class SchoolLoading {
	public static Set<School> loadSchool(){
		Set<School> schoolInfo = new LinkedHashSet<School>();
		schoolInfo.add(new School("Delhi Public School, Branch1","City - Jaipur,State- Rajasthan"));
		return schoolInfo;
		
	}

}
