package com.Sprint4Day1.Question1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentComparator implements Comparator<Map.Entry<String, Student>> {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		
	return	Integer.compare(o1.getValue().getMarks(), o2.getValue().getMarks());
		
	}

	

}

