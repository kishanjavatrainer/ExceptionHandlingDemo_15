package com.infotech.client;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ClientTest1 {

	public static void main(String[] args) {
		File propFile = new File("");
		try {
			readFile(propFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(File filename) throws FileNotFoundException, EOFException {
		InputStream in = new FileInputStream(filename);
		// Rest of the code goes here
	}
}
