package com.Sprint2Day3Q2;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffer {

	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("Enter your name: ");
//		String raja = br.readLine();
//		String yadav = br.readLine();
//
//		System.out.println(raja);
//		System.out.println(yadav);

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int y = scn.nextInt(); // 1stEnter 25 2ndEnter

		System.out.println("Enter name: ");
		int z = scn.nextInt(); // 1stEnter 25 2ndEnter
		String temp = scn.nextLine(); // 3rdEnter
		String raja = scn.nextLine();// 2nEnter Raja 3rdEnter

		System.out.println("Enter last name: ");
		String yadavji = scn.next(); // 3rdEnter

		System.out.println("Enter chal gaya");
		System.out.println();
		System.out.println(y + "Y"); //
		System.out.println( z + "Z"); //
		System.out.println(temp); //
		System.out.println(raja); //
		System.out.println(yadavji); //

	}

}
