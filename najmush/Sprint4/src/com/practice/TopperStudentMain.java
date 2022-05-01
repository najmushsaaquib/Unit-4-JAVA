package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TopperStudentMain {

	public static void main(String[] args) {

		Map<String, TopperStudent> hm = new HashMap<>();

		hm.put("Maharastra", new TopperStudent(10, "Ganesh", 950));
		hm.put("Tamilnadu", new TopperStudent(12, "Surya", 850));
		hm.put("Telangana", new TopperStudent(15, "Venkat", 920));
		hm.put("Haryana", new TopperStudent(16, "Dinesh", 910));
		hm.put("Kerla", new TopperStudent(18, "Srinu", 880));

		List<Map.Entry<String, TopperStudent>> students = new ArrayList<>(hm.entrySet());
		
		Collections.sort(students, new TopperComparator());
		
		Map<String, TopperStudent> sortedMap = new LinkedHashMap<>();
		 for(	Map.Entry<String, TopperStudent> stud : students) {
			 	
			  sortedMap.put(stud.getKey(), stud.getValue());
		 }

		System.out.println("Printing the topper students from every state");
		System.out.println();
		for (Map.Entry<String, TopperStudent> x : students) {
			System.out.println("====================================");
			System.out.println("Topper from " + x.getKey());
			TopperStudent stud = x.getValue();
			System.out.println("Name : " + stud.getName());
			System.out.println("Roll : " + stud.getRoll());
			System.out.println("Marks : " + stud.getMark());
			System.out.println();
		}

	}

}
