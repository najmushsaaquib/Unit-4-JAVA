package com.Sprint4Day3.Question3;

public class Common {

	public void fun1(String name) {

		System.out.println("Welcome to Fun1");
		System.out.println(name +" job started by Thread :"+Thread.currentThread().getName());
		synchronized (Common.class) {

			for (int x = 1; x <= 5; x++) {

				System.out.println("Achieving class lock with " + name + " " + x);
			}

		}
		
		System.out.println(name +"..job completed by Thread :"+Thread.currentThread().getName());
		System.out.println("End of Fun1");

	}
}
