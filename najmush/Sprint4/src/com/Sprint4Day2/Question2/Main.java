package com.Sprint4Day2.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		List<Student> listOfStudent = new ArrayList<>();
		
		listOfStudent.add(new Student(11, "Raja" , 377));
		listOfStudent.add(new Student(13, "Rahul" , 177));
		listOfStudent.add(new Student(07, "Satya" , 240));
		listOfStudent.add(new Student(41, "Najmush" , 480));
		listOfStudent.add(new Student(19, "Anuj" , 404));
		listOfStudent.add(new Student(10, "Aniket" , 99));
		
		System.out.println("List of student without sorting or filter");
		System.out.println();
		System.out.println(listOfStudent);
		
		Collections.sort( listOfStudent, (one, two)  -> one.getRoll() > two.getRoll() ? 1 : -1);
		
		System.out.println();
		System.out.println("List of student After sorting the student list according to their roll number");
		System.out.println();
		for(Student s : listOfStudent) {
			System.out.println(s);
		}
		
		
		System.out.println();
		System.out.println("List of student After filtering the student list according to their marks");
		System.out.println();
		
		Stream<Student> ss = listOfStudent.stream().filter( s -> s.getMarks() > 250);
		ss.forEach( x -> System.out.println(x));
	}

}
