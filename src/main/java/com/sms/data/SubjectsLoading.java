package com.sms.data;

import java.util.LinkedHashSet;
import java.util.Set;

import com.sms.entity.Subject;

public final class SubjectsLoading {
	public static Set<Subject> loadSubjects() {
		Set<Subject> subjects = new LinkedHashSet<Subject>();
		subjects.add(new Subject(1, "Mathematics"));
		subjects.add(new Subject(2, "Science"));
		subjects.add(new Subject(3, "English"));
		subjects.add(new Subject(4, "Hindi"));
		return subjects;
	}
}
