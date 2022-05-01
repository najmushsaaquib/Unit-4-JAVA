package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapPractice {

	public static void main(String[] args) {

		int[] arr = { 10, 2, 5, 12, 15, 16, 7, 6 };

		// sorting & printing the array
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("------------------------------------------------------------");

//		Binary Search using inbuilt method
		int result = Arrays.binarySearch(arr, 7);
		if (result < 0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index :" + result);

		System.out.println("------------------------------------------------------------");

//		Useful Methods of Collections Class
		List<Integer> list = Arrays.asList(10, 2, 5, 12, 15, 16, 7, 6);

		// Reverse the list
		Collections.reverse(list);
		System.out.println(list);

		// Trying to sort the student on the basis of marks using comparator made by
		// Lambda function
		List<StudentOne> sOne = new ArrayList<>();

		sOne.add(new StudentOne(10, "name1", 850));
		sOne.add(new StudentOne(12, "name2", 450));
		sOne.add(new StudentOne(14, "name3", 950));
		sOne.add(new StudentOne(15, "name4", 550));
		sOne.add(new StudentOne(16, "name5", 650));

		Collections.sort(sOne, (s1, s2) -> s1.getMark() > s2.getMark() ? 1 : -1);
		for (StudentOne x : sOne) {
			System.out.println(x);
		}

		System.out.println("------------------------------------------------------------");

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Object[] or = al.toArray();
		for (Object o : or) {
			int x = (Integer) o;
			System.out.println(x);
		}

		System.out.println("------------------------------------------------------------");

	}

}
