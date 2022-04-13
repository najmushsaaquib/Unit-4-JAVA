package com.assignmetnsDay1;

public class WholeNumber {

	public static void wholeNumber(int num) {
		
		if(num < 0) {
			System.out.println("Error");
		}
		
		else if(num%2 != 0) {
			System.out.println(num);
		}
		else if(num%2==0) {
			
			num = num + (10 - num % 10);
			System.out.println(num);
			
		}
	}
	
	public static void main(String[] args) {
		wholeNumber(0);
	}

}
