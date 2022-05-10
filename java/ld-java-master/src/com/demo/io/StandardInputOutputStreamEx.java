package com.demo.io;

import java.util.Scanner;

public class StandardInputOutputStreamEx {
public static void main(String[] args) {
	// keyboard / standard input stream // System.in // read binary data
	Scanner scanner = new Scanner(System.in);
	// monitor / standard output stream // System.out // write binary data
	System.out.println("Msg :");
	String msgString = scanner.nextLine();
	System.out.println(msgString);
}
}
