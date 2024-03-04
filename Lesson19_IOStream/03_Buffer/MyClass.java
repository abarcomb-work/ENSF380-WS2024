/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.io.*;

public class MyClass {
	public static void main(String[] args) throws Exception {
		var out = new PrintWriter(System.out);
		out.write("Manual flush.");
		Thread.sleep(2000);
		out.flush();

		out.println();
		out.printf("My cat is %d years old.", 11);	
		out.println();
		Thread.sleep(2000);
		out.close();
	}
}
