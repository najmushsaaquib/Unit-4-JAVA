package com.assignmetnsDay1;

public class JavaBean {

	public static void main(String[] args) {
		
		Student sOne = new Student();
		sOne.setAge(19);
		sOne.setMarks(422);
		sOne.setName("Raja Yadav");
		sOne.setRoll(135);
		
		System.out.println(sOne.getName());
		System.out.println(sOne.getAge());
		System.out.println(sOne.getRoll());
		System.out.println(sOne.getMarks());
		
		Student sTwo = new Student(135,"Najmush", 21, 251);
		
		
		System.out.println(sTwo.getName());
		System.out.println(sTwo.getAge());
		System.out.println(sTwo.getRoll());
		System.out.println(sTwo.getMarks());
		
	}

}
