package com.evaluation;

public class ScheduleOfWeek {

	public static void main(String[] args) {
		
		String schedule;
		int dayOfWeek = 8;
		
		switch (dayOfWeek) {
		case 1:
			schedule = "Gym in the morning.";
			break;
		case 2:
			schedule = "Class after work.";
			break;
		case 3:
			schedule = "Meetings all day.";
			break;
		case 4:
			schedule = "Work From Home";
			break;
		case 5:
			schedule = "Game night after work.";
			break;
		default:
			schedule = "Free!";
			break;
			
			
		}
			
		System.out.println(schedule);	
		
	}

}
