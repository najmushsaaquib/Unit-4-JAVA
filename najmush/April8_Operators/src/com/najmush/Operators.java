package com.najmush;

public class Operators {
	
	
	
	public static void main(String[] args) {
		
		int x = 7;
		int res = printNum(x);
		
	}
	
	public static int printNum(int n) {
		
		if(n==0 || n == 1) return n;
		
		printNum(n-1);
		System.out.println(n);
		
		
	}
}
