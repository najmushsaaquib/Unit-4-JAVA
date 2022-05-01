package com.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<>();

		hs.add("Delhi");
		hs.add("Mumbai");
		hs.add("Chennai");
		hs.add("Pune");
		hs.add("Delhi"); // duplicate element
		hs.add(null); // adding null
		hs.add("Bangaluru");

		for (String x : hs) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		Set<StudentsComparable> ts = new TreeSet<>(  );
		
		ts.add(new StudentsComparable(20,"Amit",520));
		ts.add(new StudentsComparable(15,"Suresh",550));
		ts.add(new StudentsComparable(22,"Ajay",540));
		ts.add(new StudentsComparable(18,"Rajesh",590));
		
		for(StudentsComparable y : ts) {
			
			System.out.println(y);
		}
 		

	}

}
