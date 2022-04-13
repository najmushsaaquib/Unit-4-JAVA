package com.assignmetnsDay1;

public class CollegeStudent {

	int roll;
	String name;
	String address;
	String collageName;

	public CollegeStudent(int roll, String name, String address) {
		// TODO Auto-generated constructor stub

		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = "NIT";
	}

	public CollegeStudent(int roll, String name, String address, String collegeName) {
		// TODO Auto-generated constructor stub

		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collegeName;
	}

	public static CollegeStudent getStudent(boolean isFromNIT) {

		if (isFromNIT) {
			CollegeStudent stud = new CollegeStudent(142, "Raja", "Delhi");

			return stud;
		} else {

			CollegeStudent notStud = new CollegeStudent(140, "Rahul", "Bihar", "DU");
			return notStud;
		}

	}

	public static void main(String[] args) {

		CollegeStudent stu = getStudent(true);

		System.out.println(stu.name);
		System.out.println(stu.roll);
		System.out.println(stu.address);
		System.out.println(stu.collageName);

		System.out.println("<======================================================>");

		CollegeStudent stu2 = getStudent(false);
		System.out.println(stu2.name);
		System.out.println(stu2.roll);
		System.out.println(stu2.address);
		System.out.println(stu2.collageName);

	}

}
