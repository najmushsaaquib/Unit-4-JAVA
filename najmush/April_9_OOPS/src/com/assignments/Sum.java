package com.assignments;

public class Sum {
	
		public static void main(String[] args) {
			
			sumOfNaturalNumbers(17);
			
			
		}
		
		 static void sumOfNaturalNumbers(int num) {
			 
			 int total = (num * (num + 1)/2 );
			 
			 System.out.println(total);
		 };
}
