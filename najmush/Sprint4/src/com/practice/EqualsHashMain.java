package com.practice;

import java.util.Set;
import java.util.HashSet;

public class EqualsHashMain {

	public static void main(String[] args) {

		Set<StudentOne> students = new HashSet<>();

		students.add(new StudentOne(10, "Ram", 500));
		students.add(new StudentOne(14, "Srinu", 600)); //duplicate object
		students.add(new StudentOne(15, "Raja", 411));
		students.add(new StudentOne(12, "Vishnu", 600));
		students.add(new StudentOne(10, "Ram", 500)); // duplicate object
		students.add(new StudentOne(14, "Srinu", 600));
		
		System.out.println(students.size());
		
		for(StudentOne x : students) {
			System.out.println(x);
		}
	}

}
