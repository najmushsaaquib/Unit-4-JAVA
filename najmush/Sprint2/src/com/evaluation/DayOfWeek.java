package com.evaluation;

public class DayOfWeek {

	public static void main(String[] args) {
		
		int dayOfTheWeek = 1; // 1-5 weekday, 6&7 weekend
		boolean holiday = true; // holiday if true
		
		if((dayOfTheWeek >= 1 && dayOfTheWeek <=5) && holiday == false) {
			System.out.println("Wake up at 7:00");
		}
		else if((dayOfTheWeek >= 1 && dayOfTheWeek <=5) && holiday == true) {
			System.out.println("Sleep in!");
		}
		else if((dayOfTheWeek == 6 || dayOfTheWeek ==7) && (holiday == true || holiday == false)) {
			System.out.println("Sleep in!");
		}
		
	}

}
