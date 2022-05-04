package com.evaluation.question2;

public class Deadlock {

	public static void main(String[] args) {

		DemoOne firt = new DemoOne();
		DemoTwo sec = new DemoTwo();

		FirstThread tOne = new FirstThread(firt, sec);
		SecondThread tTwo = new SecondThread(firt, sec);

		tOne.start();
		tTwo.start();

	}
	//Since all the methods of the both classes are synchronized, this will result in deadlock becuase one thread
	// will wait for other and that will wait for the first one.
	// It will become like a infinite loop of waiting area.
	// If we want to get out of this situation, we need to make any one of the methods to non-synchronized
	
}
