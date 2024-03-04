/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.io.*;

public class MyClass {
	final static String DE = "deserialize";
	final static String SE = "serialize";
	final static String FN = "basic.ser";

	public static void main(String[] args) {
	
		if (args.length > 0) {
			if (DE.equals(args[0])) {
				readObj();
			} else if (SE.equals(args[0])) {
				writeObj();
			}
		} else {
			System.out.println("Program must be called with argument '" + DE +
			"' or '" + SE + "'.");
		}
	}

	public static void writeObj() {
		ObjectOutputStream output = null;
		BasicClass record = null;

		try {
			output = new ObjectOutputStream(new FileOutputStream(FN));
		}

		catch (IOException e) {
			System.err.println("Error opening file");
			System.exit(1);
		}

		try {
			var txt = new String("Random bit of text");
			record = new BasicClass(txt, 1001);
			System.out.printf("String: %s, Number %d%n", 
			  record.getString(), record.getNumber());
			output.writeObject(record);
		}

		// Keeping this short as it is not the focus of the code.
		// Provide more relevant catches in real code
		catch (Exception e) {
			System.err.println("Generic error handler");
			e.printStackTrace();
		}


		finally {
			try {
				if (output != null) {
					output.close();
				}
			}
			catch(IOException e) {
				System.err.println("Error closing file.");
				System.exit(1);
			}
		}
	}

	public static void readObj() {
		ObjectInputStream input = null;
		BasicClass record = null;

		try {
			input = new ObjectInputStream(new FileInputStream(FN));
		}
		catch (IOException e) {
			System.err.println("Error opening file");
			System.exit(1);
		}

		try {
			record = (BasicClass) input.readObject();
			System.out.printf("String: %s, Number %d%n", 
			  record.getString(), record.getNumber());
		}
	
		// Keeping this short as it is not the focus of the code.
		// Provide more relevant catches in real code
		catch (Exception e) {
			System.err.println("Generic error handler");
			e.printStackTrace();
		}

		finally {
			try {
				if (input != null) {
					input.close();
				}
			}
			catch(IOException e) {
				System.err.println("Error closing file.");
				System.exit(1);
			}
		}
	}
}


class BasicClass implements Serializable {
	static final long serialVersionUID = 3L;
	private int number;
	private String string;

	BasicClass(String string, int number) {
		this.string = string;
		this.number = number;
	}

	public String getString() {
		return this.string;
	}

	public int getNumber() {
		return this.number;
	}
}
