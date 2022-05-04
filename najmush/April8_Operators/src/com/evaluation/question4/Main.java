package com.evaluation.question4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(17, 250, "Ratan"));
		studentList.add(new Student(10, 470, "Abhinav"));
		studentList.add(new Student(25, 396, "Rohit"));
		studentList.add(new Student(02, 196, "Rajnee"));
		studentList.add(new Student(12, 196, "Shoiab"));
		
		System.out.println(studentList);
		
	}

}
