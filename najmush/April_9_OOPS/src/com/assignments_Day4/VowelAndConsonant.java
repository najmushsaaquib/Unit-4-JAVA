package com.assignments_Day4;

public class VowelAndConsonant {
	
	void vowelAndConsonant(char z) {
		
		if(z < 'A' || z > 'z') {
			System.out.println("Invalid Character");
		}
		
		else if(z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U') {
			System.out.println("Vowel");
		} else System.out.println("Consonant");
		
	}
	
	public static void main(String[] args) {
		
		VowelAndConsonant vowelConst = new VowelAndConsonant();
		
		vowelConst.vowelAndConsonant('a');
		vowelConst.vowelAndConsonant('C');
		vowelConst.vowelAndConsonant('%');
		
	}

}
