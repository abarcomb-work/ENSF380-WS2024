/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.Scanner;
import java.io.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner scan = null;

		try {
			scan = new Scanner(new BufferedReader(new FileReader("example.txt")));
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		}

		catch (Exception e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}

		finally {
			if (scan != null) {
				scan.close();
			}
		}
		
	}
}
