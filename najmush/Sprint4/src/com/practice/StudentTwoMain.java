package com.practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentTwoMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		List<StudentTwo> lst = new ArrayList<>();

		int count = 1;

		while (true) {

			System.out.println("Enter the details of student " + count++);
			System.out.println("Enter the name of the student");
			String name = scn.nextLine();

			System.out.println("Enter roll number");
			int roll = scn.nextInt();

			System.out.println("Enter marks of the student");
			int marks = scn.nextInt();

			lst.add(new StudentTwo(roll, name, marks));

			System.out.println("Want More (y/n) ?");
			String choice = scn.next();
			scn.nextLine();
			System.out.println();
			if (choice.equalsIgnoreCase("n"))
				break;

		}

		
		scn.close();

		System.out.println("Printing Details of all Students");
		System.out.println("=================================");
		for (StudentTwo student : lst) {
			System.out.println("Roll is :" + student.getRoll());
			System.out.println("Name is :" + student.getName());
			System.out.println("Marks is :" + student.getMarks());
			System.out.println("-----------------------------");
		}
	}

}
