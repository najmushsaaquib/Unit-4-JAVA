package com.practice;

import java.io.*;

public class ReaderMain {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("E:\\MASAI\\Unit 4\\Unit-4-JAVA\\najmush\\Sprint4\\src\\com\\practice\\abc.txt");
		int i=fr.read();
		while( i != -1) {
		System.out.print((char) i);
		i = fr.read();
		}
		
		fr.close();
	}

}
