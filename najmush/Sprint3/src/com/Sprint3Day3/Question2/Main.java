package com.Sprint3Day3.Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		EmployeeBonus bonusObj = new EmployeeBonus();

		System.out.println("Please enter your joinng date in dd-MM-yyyy format");

		String joiningDate = scn.next();

		try {

			double bonus = bonusObj.getBonus(joiningDate);
			System.out.println("🍀 Congratulations! you are getting a bonus of Rs " + bonus);

		}

		catch (InvalidAge e) {

			System.out.println(e.getMessage());
		}

		scn.close();
		System.out.println();
		System.out.println("Main method executed gracefully.");

	}

}
