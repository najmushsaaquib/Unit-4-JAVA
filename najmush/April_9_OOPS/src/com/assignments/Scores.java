package com.assignments;

public class Scores {
	
	public static void main(String[] args) {
		
		totalRunScored(20,5,3,4,6);
	}
	
	static void totalRunScored(int one, int two, int three, int four, int six) {
		
		int totalTwo = 2 * two;
		int totalThree = 3 * three;
		int totalFour = 4 * four;
		int totalSix = 6 * six;
		int totalScored = (one + totalTwo + totalThree + totalFour + totalSix);
		
		System.out.println(totalScored);
		
	}
}
