/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

// This is a rough implementation of manual "serialization". Don't use this.
// Use serialization instead!

public class MyClass {
	// Read in the contents of a file to an ArrayList. Use ' # '
	// as a divider
	public static ArrayList<String> readFile() throws IOException {
		Scanner scan = null;
                ArrayList<String> allText = new ArrayList <String>();
		var line = new String();
                var tmp = new String();

		scan = new Scanner(new BufferedReader(new FileReader("example.txt")));
		while (scan.hasNext()) {
			tmp = scan.next();
			// Token found, end of this section of content
			if (tmp.equals("#")) {
				allText.add(line);	// Store line in arraylist
				line = "";		// Reset line
			// Divider not found, add token to line
			} else {
				line = line + " " + tmp;
				tmp = "";
			}
		}

 		allText.add(line);	// Store last line in arraylist
                return allText;
        }

	// Write out the contents of the ArrayList to the file. Use ' # '
	// as a divider. Assumes there is at least one line of content.
	public static void writeFile(ArrayList<String> data) throws IOException {
		Iterator<String> iter = data.iterator();
 		FileWriter outFile = new FileWriter("example.txt");

		String line = iter.next();
		outFile.write(line);

		while(iter.hasNext()) {
			outFile.write(" # ");
			line = iter.next();
 			outFile.write(line);
		}

		outFile.close();
	}

	// If the content is original, replace e with 3.
	// If the content is not original, replace 3 with e.
	// Assumes that there is content, and the first line contains a 3/e
	public static ArrayList<String> modifyText(ArrayList<String> data) {
		Pattern isLeet = Pattern.compile("3");
		Pattern replacer;

		Iterator<String> iter = data.iterator();
		String line = iter.next();
		Matcher myMatcher = isLeet.matcher(line);
		boolean isMatch = myMatcher.find();

		// Leet, replace all 3 with e
		if (isMatch) {
			line = line.replaceAll("3", "e");
			data.set(0, line);
			int i = 1;
			while(iter.hasNext()) {
				line = iter.next();
				line = line.replaceAll("3", "e");
				data.set(i, line);
				i++;	
			}
		// Original, replace all e with 3
		} else {
			line = line.replaceAll("e", "3");
			data.set(0, line);
			int i = 1;
			while(iter.hasNext()) {
				line = iter.next();
				line = line.replaceAll("e", "3");
				data.set(i, line);
				i++;	
			}
		}
		return data;
	}
		
	public static void main(String[] args) throws IOException {

		// Read the current content of the file
		ArrayList<String> input = readFile();
		Iterator<String> iter = input.iterator();
		while(iter.hasNext()) {
 			System.out.println(iter.next());
		}

		// Make some changes to the content
		input = modifyText(input);

		// Write out the current content of the arraylist
		writeFile(input);
	}
}
