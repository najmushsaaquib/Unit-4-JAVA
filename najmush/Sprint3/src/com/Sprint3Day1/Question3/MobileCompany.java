package com.Sprint3Day1.Question3;

import java.util.Scanner;

public class MobileCompany {

	public void phoneModel(String company, String... modelNames) {

		String[] outdatedModels = { "note4", "note5", "note6", "note7" };

		System.out.println("Company Name : " + company);
		System.out.println("We have these models with us");

		for (String x : modelNames) {

			boolean flag = false;
			
			for(String mod : outdatedModels) {
				if(mod == x) {
					flag = true;
					break;
				}
			}
			
			if (flag)
				System.out.println(x + "_OUTDATED");
			else
				System.out.println(x);
		}

	};

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter mobile company name");
		String comp = scn.next();

		MobileCompany company = new MobileCompany();
		String[] models = { "note5", "X7Max 5G", "Oppo Reno 6G", "galaxy S2", "z-fold", "note6" };
		company.phoneModel(comp, models);
		scn.close();

	}

}
