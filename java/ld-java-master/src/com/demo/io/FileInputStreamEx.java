package com.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		// file on hard disk
		File file = new File("msg.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
//			Reads a byte of data from this input stream. 
			int byteVal = fileInputStream.read();
			// typecast int > char
			char charVal =	(char)byteVal;
			while(byteVal != -1) {
			// read the next byte
			charVal =	(char)byteVal;
			System.err.print(charVal);
			byteVal = fileInputStream.read();
			}
			fileInputStream.close();
//			System.err.println("\ndone");
		} catch (IOException e) {
			System.err.println("Unable to get file input stream : " + e);
		}
	}
}
