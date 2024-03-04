/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.io.*;

public class MyClass {
	RandomAccessFile file = null;
	String fn = "output.dat";

	public static void main(String[] args) {
		var object = new MyClass();
		object.start();
		object.writeMe();
		object.end();

		object.start('r');
		int point = object.readMe();
		object.end();

		object.start('r');
		object.seekMe(point);
		object.end();
	}

	public void seekMe(int offset) {
 		char letters[] = new char[2];
		char temp;

		try {
			file.seek(offset);
			for (int count=0; count < letters.length; count++) {
                        	temp = file.readChar();
                                letters[count] = temp;
                        }
		}

		catch (IOException e) {
			System.err.println("Could not read file: " + fn);
			this.end();
			System.exit(1);
		}

		String str = String.valueOf(letters);
		System.out.printf("String: %s%n", str);
		return;
	}

	public int readMe() {
		int number = 0;
		double decimalNum = 0;
		int pointer = 0;

		try {
			number = file.readInt();
			decimalNum = file.readDouble();
			pointer = (int) file.getFilePointer();
		}
		catch (IOException e) {
			System.err.println("Could not read file: " + fn);
			this.end();
			System.exit(1);
		}

		System.out.printf("Int: %02d, Double: %.3f%n", number, decimalNum);
		return pointer;
	}

	public void writeMe() {
		var str = new String("hi");

		try {
			file.writeInt(6);
			file.writeDouble(4.01);
			file.writeChars(str);
		}

		catch (IOException e) {
			System.err.println("Could not write to file: " + fn);
			this.end();
			System.exit(1);
		}
	}

	public void start(char r) {
		try {
			file = new RandomAccessFile(fn, "r");
		}

		catch (IOException e) {
			System.err.println("Could not open file: " + fn);	
			System.exit(1);
		}
	}

	public void start() {
		try {
			file = new RandomAccessFile(fn, "rw");
		}

		catch (IOException e) {
			System.err.println("Could not open file: " + fn);	
			System.exit(1);
		}
	}

	public void end() {
		try {
			if (file != null) {
				file.close();
			}
		}

		catch(IOException e) {
			System.err.println("Could not close file: " + fn);	
			System.exit(1);
		}
	
	}
}
