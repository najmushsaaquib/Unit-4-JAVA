package com.Sprint3Day1.Question1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {

		Hotel hotel = null;

		if (amount > 1000) {
			hotel = new TajHotel();

		} else if (amount > 200 && amount < 1000) {
			hotel = new RoadSideHotel();
		}

		return hotel;
	};

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Demo demoHotel = new Demo();

		System.out.println("Please enter an amount");

		Hotel hotelObj = demoHotel.provideFood(scn.nextInt());

		if (hotelObj != null) {

			hotelObj.chickenBiryani();
			hotelObj.masalaDosa();

			if (hotelObj instanceof TajHotel) {

				TajHotel taj = (TajHotel) hotelObj;
				taj.welcomeDrink();
			}

		} else {
			System.out.println("Please enter an valid amount;");
		}

		scn.close();

	}

}
