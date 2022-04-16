package com.Sprint2Day3Q1;

import java.util.Scanner;

public class RunClass {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the students details");
		System.out.println();
		Hosteller hosteller = new Hosteller();
		System.out.println("Enter Student ID: ");
		hosteller.studId = scn.nextInt();
		System.out.println("Enter Student Name: ");
		hosteller.studName = scn.next();

		System.out.println("Enter Exam Fee : ");
		hosteller.examFee = scn.nextDouble();

		System.out.println("Enter your Hostel Fee : ");
		hosteller.hostelFee = scn.nextDouble();

		hosteller.displayDetails();

	}

}
