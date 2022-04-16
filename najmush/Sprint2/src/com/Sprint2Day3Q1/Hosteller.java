package com.Sprint2Day3Q1;

import java.util.Scanner;

public class Hosteller extends Student {

	double hostelFee;
	
//	@Override
	void displayDetails() {

		System.out.println("Student id is -> " + this.studId);
		System.out.println("Student name is -> " + this.studName);
		System.out.println("Student exam fee is -> " + (this.examFee + this.hostelFee));
		System.out.println("Remaining fee is : " + payFee());
	};
	
	@Override
	double payFee() {

		Scanner scn = new Scanner(System.in);

		double totalFee = this.hostelFee + this.examFee;

		System.out.println("Enter your fee");

		double fee = scn.nextInt();

		totalFee -= fee;
		scn.close();
		return totalFee;
	};

}
