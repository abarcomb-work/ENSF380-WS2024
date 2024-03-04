/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.io.File;

public class MyClass {
	public static void main(String[] args) throws Exception {
                // Obtain the user's home directory and set our filePath
                // as the sub-directory Downloads 
                String homeDir = System.getProperty("user.home");
                File filePath = new File(homeDir, "Downloads");

		if (filePath.exists()) {
			System.out.printf("Exists: %s", filePath.getName());

			if (filePath.isDirectory()) {
				System.out.printf("%nDir: %s", filePath.getName());
				String dir[] = filePath.list();
				System.out.println("\nContents:");
				for (String dirName : dir) {
					System.out.printf("  %s%n", dirName);
				}
			}
		} else {
			System.out.printf("Does not exist: %s", filePath);
		}
	}
}
