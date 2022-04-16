package com.assignments_Day4;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		
		System.out.println("Roll is: " + roll);
		System.out.println("Name is: " + name);
		System.out.println("Marks is: " + marks);
	}
	
	public static void main(String[] args) {
		
		Student studentOne = new Student();
		Student studentTwo = new Student();
		
		System.out.println("Details of First Student");
		studentOne.roll = 142;
		studentOne.marks = 78;
		studentOne.name = "Raja Ram Yadav";
		studentOne.displayStudentDetails();
		
		System.out.println("===================================================");
		
		System.out.println("Details of Second Student");
		studentTwo.roll = 140;
		studentTwo.marks = 87;
		studentTwo.name = "Rahul Kumar";
		studentTwo.displayStudentDetails();
		
		studentOne = null;
		studentTwo = null;
		
	}
}
