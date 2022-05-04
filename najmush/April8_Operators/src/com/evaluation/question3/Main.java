package com.evaluation.question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee(01, "Ratan", new Address("Delhi", "New Delhi", 110044), "ratan@gmail.com",
				"password@12");

		try {
			FileOutputStream fileOutStream = new FileOutputStream("emp.txt");
			try (ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutStream)) {
				objOutStream.writeObject(emp);
			}

			FileInputStream fileInput = new FileInputStream("emp.txt");
			try (ObjectInputStream objInput = new ObjectInputStream(fileInput)) {
				System.out.println(objInput.readObject());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception i) {
			i.printStackTrace();
		}

	}

}
