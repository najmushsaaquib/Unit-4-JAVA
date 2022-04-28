package com.Sprint3Day3.Question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EmployeeBonus {

	public double getBonus(String joiningDate) throws InvalidAge {

		double bonus = 0;

		try {

			LocalDate userInputDate = LocalDate.parse(joiningDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate currentDate = LocalDate.now();
			Period diff = Period.between(userInputDate, currentDate);
			double bonusDiff = diff.getYears();

			if (userInputDate.isAfter(currentDate)) {
				throw new InvalidAge();
			}

			if (bonusDiff < 1)
				bonus = 5000;
			else if (bonusDiff >= 1 && bonusDiff < 2)
				bonus = 8000;
			else
				bonus = 10000;
		}

		catch (InvalidAge age) {
			throw new InvalidAge("Age should not be in the future");
		}

		catch (Exception err) {
			throw new InvalidAge("Please enter a valid date format");

		}

		return bonus;
	}

}
