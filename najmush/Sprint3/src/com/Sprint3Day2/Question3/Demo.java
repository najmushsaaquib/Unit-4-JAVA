package com.Sprint3Day2.Question3;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m) {

		switch (m) {

		case JAN:
			System.out.println("This is the 1st Month of the Year January");
			break;

		case FEB:
			System.out.println("This is the 2nd Month of the Year February");
			break;
		case MARCH:
			System.out.println("This is the 3rd Month of the Year March");
			break;
		case APRIL:
			System.out.println("This is the 4th Month of the Year April");
			break;
		case MAY:
			System.out.println("This is the 5th Month of the Year May");
			break;
		case JUNE:
			System.out.println("This is the 6th Month of the Year June");
			break;
		case JULY:
			System.out.println("This is the 7th Month of the Year July");
			break;
		case AUG:
			System.out.println("This is the 8th Month of the Year August");
			break;
		case SEPT:
			System.out.println("This is the 9th Month of the Year September");
			break;
		case OCT:
			System.out.println("This is the 10th Month of the Year October");
			break;
		case NOV:
			System.out.println("This is the 11th Month of the Year November");
			break;
		case DEC:
			System.out.println("This is the 12th Month of the Year December");
			break;

		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a month name");
		
		String mon = scn.next().toUpperCase();
		
		try {
			
			Month m1 = Month.valueOf(mon);
			Demo ekaurDemo = new Demo();
			ekaurDemo.showDetails(m1);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		
		scn.close();
		System.out.println();
		System.out.println("Main program executed gracefully");
		
		
	}

}
