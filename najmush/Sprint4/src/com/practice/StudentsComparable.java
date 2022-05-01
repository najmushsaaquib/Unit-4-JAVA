package com.practice;

public class StudentsComparable {

	private int roll;
	private String name;
	private int marks;

	public StudentsComparable() {
	}

	public StudentsComparable(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentsComparable [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

//	@Override
//	public int compareTo(StudentsComparable student) {
//		
//		 return this.name.compareTo(student.name);
//		
//		
//	}

}
