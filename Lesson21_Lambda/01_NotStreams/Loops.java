/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.*;
import java.util.regex.*;
  
public class Loops {
        public static void main(String[] args) {
		dataModificationLoop();
		System.out.println();
		dataFilterLoop();
	}

        public static void dataModificationLoop() {
		// Create an arraylist
		ArrayList<String> origList = new ArrayList<>();
		origList.add("This");
		origList.add("is");
		origList.add("some");
		origList.add("text");

		// Create a new arraylist
		ArrayList<String> newList = new ArrayList<>();

		// Iterate over the original arraylist and store a modified
		// version of each element in the new arraylist
		Iterator<String> it = origList.iterator();
		while (it.hasNext()) {
		  	newList.add(it.next() + "!");  
		}

		// Print the new array
		Iterator<String> itNew = newList.iterator();
		while (itNew.hasNext()) {
			System.out.println(itNew.next());
                }
        }

	public static void dataFilterLoop() {
		// Create an arraylist
		ArrayList<String> origList = new ArrayList<>();
		origList.add("This");
		origList.add("is");
		origList.add("some");
		origList.add("text");

		// Create a new arraylist
		ArrayList<String> newList = new ArrayList<>();

		// Create the pattern we are searching for
		String regex = "t";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// Iterate over the original arraylist and store in the new
		// arraylist if it contains a T
		Iterator<String> it = origList.iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			Matcher match = pattern.matcher(tmp);
			boolean matchFound = match.find();

			if (matchFound==true) {
		  		newList.add(tmp);  
			}
		}

		// Print the new array
		Iterator<String> itNew = newList.iterator();
		while (itNew.hasNext()) {
			System.out.println(itNew.next());
                }
	}

}

