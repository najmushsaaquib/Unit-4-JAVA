package com.evaluation.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		PlayList play = new PlayList();

		System.out.println("Please enter 4 songs name with their movie name");

		for (int x = 1; x <= 4; x++) {

			System.out.println("Enter song name " + x);
			String song = scn.nextLine();

			System.out.println("Enter movie name " + x);
			String movie = scn.nextLine();

			play.addSong(new Song(song, movie));

		}

		for (Song x : play.list) {

			x.play();
		}

		scn.close();

	}

}
