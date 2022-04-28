package com.Sprint3Day3.Question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainDate {

	public int getAge(String dob) throws InvalidDateFormat {

		int age = 0;

		try {

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // DTF just formats the date if given

			LocalDate userInputDate = LocalDate.parse(dob, dtf);

			LocalDate currentDate = LocalDate.now();

			Period difference = Period.between(userInputDate, currentDate);

			age = difference.getYears();

		} catch (Exception e) {

			InvalidDateFormat invalidFormat = new InvalidDateFormat("Please enter a valid date format.");
			throw invalidFormat;
		}

		return age;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		MainDate dateObj = new MainDate();

		System.out.println("Welcome back to age calculator.");
		System.out.println("Enter your Date Of Birth in dd-MM-yyyy format");

		String dob = scn.next();
		try {

			int age = dateObj.getAge(dob);

			if (age > 0) {
				System.out.println("You are " + age + " years old.");
			} else
				System.out.println("Date should not be in Future");

		} catch (InvalidDateFormat error) {
			System.out.println(error.getMessage());
		}

		scn.close();
		System.out.println("Program terminated normally with grace.");
	}

}
