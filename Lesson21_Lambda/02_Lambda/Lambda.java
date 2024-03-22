/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.ArrayList;

public class Lambda {
	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		myList.add("This");
		myList.add("is");
		myList.add("some");
		myList.add("text.");

		// Example Lambda expression
		// Note: it is not necessary to declare v as type String
		myList.forEach( (String v) -> {System.out.println(v);} );

		// Alternative
		// myList.forEach( (String v) -> System.out.println(v) );
	}

}
