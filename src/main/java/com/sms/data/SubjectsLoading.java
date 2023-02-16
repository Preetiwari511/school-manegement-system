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
		subjects.add(new Subject(5,"Social Science"));
		subjects.add(new Subject(6,"History"));
		subjects.add(new Subject(7,"Geography"));
		subjects.add(new Subject(8,"Economics"));
		subjects.add(new Subject(9,"Accounts"));
		subjects.add(new Subject(10,"Biology"));
		subjects.add(new Subject(11,"Chemistry"));
		subjects.add(new Subject(12,"Physics"));
		subjects.add(new Subject(13,"Computers"));
		return subjects;
	}
}
