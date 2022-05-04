package com.evaluation.question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {
	HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model) {

		if (mobiles.containsKey(company)) {

			ArrayList<String> already = mobiles.get(company);
			already.add(model);
			mobiles.put(company, already);

		} else {
			ArrayList<String> models = new ArrayList<>();
			models.add(model);
			mobiles.put(company, models);

		}
		return "Mobile added successfully";

	}

	public List<String> getModels(String company) throws InvalidMobileException {

		if (!mobiles.containsKey(company)) {
			throw new InvalidMobileException("Invalid company name, we don't have the models of this company name");
		}

		List<String> models = mobiles.get(company);

		return models;

	}

	public static void main(String[] args) {

		Mobile mob = new Mobile();
		mob.addMobile("apple", "iPhone 12");
		mob.addMobile("apple", "iPhone 11");
		mob.addMobile("apple", "iPhone 10");
		mob.addMobile("samsung", "Galaxy M2");
		mob.addMobile("moto", "Moto G4");
		mob.addMobile("moto", "gobi");
		mob.addMobile("xiomi", "note 4");
		mob.addMobile("xiomi", "note 8");
		mob.addMobile("onePlus", "note 5");
		mob.addMobile("redmi", "note 8 pro 5G");
		mob.addMobile("IQ", "iq 9");

		try {
			List<String> out = mob.getModels("applsse");

			for (String x : out) {
				System.out.println("Model names are : " + x);
			}

		} catch (InvalidMobileException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Main method ended gracefully");
	}
}
