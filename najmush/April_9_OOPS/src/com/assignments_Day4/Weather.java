package com.assignments_Day4;

public class Weather {
	
	public static void main(String[] args) {
		
	
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 48.89;
		
//		if(isSnowing == true || isRaining == true || temperature < 60.0) {
//			System.out.println("Let's stay Home");
//		} else System.out.println("Let's go out!");

		String res = (isSnowing|| isRaining || temperature < 50.0) ? "Let's stay Home": "Let's go out!";
		System.out.println(res);
		
	}
	
	
}
