package com.najmush;

public class Operators {

	public static void main(String[] args) {

		int x = 7;
		printNum(x);

	}

	public static void printNum(int n) {

		if (n == 0 || n == 1) {

			System.out.println(n);
			return;
		}

		printNum(n - 1);
		System.out.println(n);
//		return 9;
	}
}
