package com.Sprint3Day2.Question2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username");
		String username = sc.next();
		boolean checkUser = Pattern.matches("[a-zA-Z]{3,8}", username);
		System.out.println("Enter Your Password :");
		String password = sc.next();
		boolean checkPass = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		System.out.println("Enter Your Mobile Number :");
		String mobile = sc.next();
		boolean checkMobile = Pattern.matches("[6789]{1}[0-9]{9}", mobile);
		System.out.println("Enter Your Email :");
		String email = sc.next();
		boolean checkEmail = Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", email);

		if (checkUser && checkPass && checkMobile && checkEmail) {

			Customer customer = new Customer(username, password, mobile, email);
			System.out.println("Your username is " + customer.getUsername());
			System.out.println("Your password is " + customer.getPassword());
			System.out.println("Your Mobile Number is " + customer.getMobileNumber());
			System.out.println("Your email is " + customer.getEmail());

		} else {
			if (!checkUser) {
				System.out.println("Please enter valid username, minimun 3 and max 8 length");
			} if (!checkPass) {
				System.out.println("Please enter valid Password, of alphaNumeric values of minimun 3 and max 8 length");

			} if (!checkMobile) {
				System.out.println("Please enter valid Mobile Number");
			} if (!checkEmail) {
				System.out.println("Please enter valid email address");

			}
		}

		
		
	}

}
