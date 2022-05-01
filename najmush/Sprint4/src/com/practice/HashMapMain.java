package com.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();

		hm.put(2, "Raja");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");

		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println("Printing all the keys of the HashMap");

		Collection<Map.Entry<Integer, String>> entrySet = hm.entrySet();

		for (Map.Entry<Integer, String> x : entrySet) {

			System.out.println(x.getKey() + " --> " + x.getValue());
		}

	}

}
