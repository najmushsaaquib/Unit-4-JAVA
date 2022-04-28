package com.evaluation.question4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter your Date of Birth in dd-MM-yyyy format");

		String userDate = scn.next();

		try {
			LocalDate currentDate = LocalDate.now();
			LocalDate userDob = LocalDate.parse(userDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

			if (userDob.isAfter(currentDate))
				System.out.println("Date of birth should not be in the future");

			else if (userDob.getYear() >= 18) {

				if (currentDate.getMonth() == userDob.getMonth()
						&& currentDate.getDayOfMonth() == userDob.getDayOfMonth()) {
					System.out.println("Happy Birthday, You are eligible to cast your vote.");
				} else
					System.out.println("You are eligible to cast your vote");
			}

		} catch (Exception e) {

			System.out.println("please pass the date in the proper format");
		}

		
		System.out.println();
		
		
		scn.close();

	}

}
