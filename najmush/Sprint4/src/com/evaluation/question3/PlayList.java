package com.evaluation.question3;

import java.util.ArrayList;

public class PlayList {

	ArrayList<Song> list = new ArrayList<>();

	public void addSong(Song song) {

		boolean flag = true;

		for (Song x : list) {

			if (x.songName.equals(song.songName) && x.movieName.equals(song.movieName)) {
				flag = false;
			}
		}

		if (flag) {

			list.add(song);
			System.out.println("Song added to the playlist successfully.");
		} else
			System.out.println("Song is already added to the playlist");

	}

}
