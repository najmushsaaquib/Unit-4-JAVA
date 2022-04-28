package com.evaluation.question3;

public class Song {

	String movieName;
	String songName;

	public void play() {

		System.out.println(songName + " of " + movieName + " is playing...! ");
	}
	
	public Song() {
	}

	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}

}
