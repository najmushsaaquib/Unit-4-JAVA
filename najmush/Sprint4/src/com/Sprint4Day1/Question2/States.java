package com.Sprint4Day1.Question2;

import java.util.HashMap;
import java.util.Map;

public class States {

	public static void main(String[] args) {

		Map<String, String> states = new HashMap<>();

		states.put("Maharashtra", "Mumbai");
		states.put("Goa", "Panji");
		states.put("Kerala", "Tiruvananthapuram");
		states.put("Chattishgarh", "Agartala");
		states.put("Telangana", "Hyderabad");

		for (Map.Entry<String, String> x : states.entrySet()) {

			System.out.println( "Capital of "  +  x.getKey() + " is  -> " + x.getValue());

		}
	}

}
