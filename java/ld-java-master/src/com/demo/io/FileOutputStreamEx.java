package com.demo.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		// file on hard disk
		File file = new File("msg.txt");
		String msgString = "Hard work leads to success!\nTechnology is interesting!";
		//to bytes
		byte [] msgBytes = msgString.getBytes();
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(msgBytes);
//			Flushes this output stream and forces any buffered output bytesto be written out. 
			fileOutputStream.flush();
			fileOutputStream.close();
			System.err.println("done");
		} catch (IOException e) {
			System.err.println("Unable to get file output stream : " + e);
		}
	}
}
