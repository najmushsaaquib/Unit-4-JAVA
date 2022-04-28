package com.Sprint4Day1.Question1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();

		hm.put("Maharastra", new Student(10, "Ganesh", 950));
		hm.put("Tamilnadu", new Student(12, "Surya", 850));
		hm.put("Telangana", new Student(15, "Venkat", 920));
		hm.put("Haryana", new Student(16, "Dinesh", 910));
		hm.put("Kerla", new Student(18, "Srinu", 880));

		List<Map.Entry<String, Student>> list = new ArrayList<>(hm.entrySet());

//		Collections.sort(list, new StudentComparator());

		Collections.sort(list, (o1, o2) -> {

			return Integer.compare(o1.getValue().getMarks(), o2.getValue().getMarks());

		});

		System.out.println(list);

		Map<String, Student> sortedMap = new LinkedHashMap<>();

		for (Map.Entry<String, Student> x : list) {

			sortedMap.put(x.getKey(), x.getValue());
		}

		System.out.println(sortedMap);

	}

}
