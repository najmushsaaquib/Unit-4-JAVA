package com.assignmentsDay2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter required number of Students ");
		int num = scan.nextInt();

		Student[] studentsArr = new Student[num];

		for (int x = 0; x < num; x++) {

			Student singleStudent = new Student();

			System.out.println("Enter roll of Student " + (x+1) + " :");
			int roll = scan.nextInt();
			singleStudent.setRoll(roll);
			System.out.println("Enter name of Student " + (x+1) + " :");
			String name = scan.next();
			singleStudent.setName(name);
			System.out.println("Enter address of Student " + (x+1) + " :");
			String address = scan.next();
			singleStudent.setAddress(address);
			System.out.println("Enter marks of Student " + (x+1) + " :");
			int marks = scan.nextInt();
			singleStudent.setMarks(marks);

			System.out.println();
			System.out.println();

			studentsArr[x] = singleStudent;

		}
		
		double total = 0;
		
		for(int i=0; i<studentsArr.length; i++) {
			
			System.out.println("Details of Student " + (i+1) + "is :");
			System.out.println("Name : " + studentsArr[i].getName());
			System.out.println("Roll : " + studentsArr[i].getRoll());
			System.out.println("Address : " + studentsArr[i].getAddress());
			System.out.println("Marks: " + studentsArr[i].getMarks());
			
			System.out.println();
			System.out.println();
			total += studentsArr[i].getMarks();
		}
		
		System.out.println("Average marks of the students are :" + total/studentsArr.length);
	}

}
