package com.Sprint2Day3Q2;

import java.util.Scanner;

public class Main {

	public static Hosteller getHostellerDetails() {

		Hosteller hostelStudent = new Hosteller();
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the Details: ");

		System.out.println("Student Id");
		hostelStudent.setStudentId(scn.nextInt());

		System.out.println("Student Name:");
		String temp = scn.nextLine();
		hostelStudent.setName(scn.nextLine());

		System.out.println("Department Id:");
		hostelStudent.setDepartmentId(scn.nextInt());

		System.out.println("Gender:");
		hostelStudent.setGender(scn.next());

		System.out.println("Phone Number:");
		hostelStudent.setPhone(scn.next());

		System.out.println("Hostel Name:");
		String tempo = scn.nextLine();
		hostelStudent.setHostelName(scn.nextLine());

		System.out.println("Room Number:");
		hostelStudent.setRoomNumber(scn.nextInt());

		System.out.println("Modify Room Number(Y/N)");

		String newRoom = scn.next();

		while (!newRoom.equals("Y") && !newRoom.equals("N") && !newRoom.equals("y") && !newRoom.equals("n")) {
			System.out.println("Please choose a valid option.");
			System.out.println();
			System.out.println("Modify Room Number(Y/N)");
			newRoom = scn.next();
		}

		if (newRoom.equals("Y") || newRoom.equals("y")) {

			System.out.println("New Room Number:");
			hostelStudent.setRoomNumber(scn.nextInt());
		}

		System.out.println("Modify Phone Number(Y/N)");
		String newPhone = scn.next();
		while (!newPhone.equals("Y") && !newPhone.equals("N") && !newPhone.equals("y") && !newPhone.equals("n")) {
			System.out.println("Please choose a valid option.");
			System.out.println();
			System.out.println("Modify Room Number(Y/N)");
			newPhone = scn.next();
		}

		if (newPhone.equals("Y") || newPhone.equals("y")) {

			System.out.println("New Phone Number:");
			hostelStudent.setPhone(scn.next());
		}

		scn.close();
		return hostelStudent;
	}

	public static void main(String[] args) {

		Hosteller stud = getHostellerDetails();

		System.out
				.println("The Student Details are: " + stud + " " + stud.getHostelName() + " " + stud.getRoomNumber());

	}

}
