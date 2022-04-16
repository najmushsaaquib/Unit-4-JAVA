package com.assignments;

public class PrimeFactors {

	
	public static void main(String[] args) {
		
		primeFactors(52);
	}
	
	static void primeFactors(int number) {
		
		if(number < 2 || number > 100) System.out.println("Invalid Number");
		else {
			
			for(int i=1; i<=number; i++) {
				if(number%i==0) System.out.println(i);
			}
    	}
	}
}
