/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class Permutations {
	public static int permutations(int length, int select) {
                if (select < 0 || length < 0) {
                        throw new IllegalArgumentException(
                          "Permutations is not defined for negative numbers");
                }

		if (length < select ) {
                        throw new IllegalArgumentException(
                          "Selection cannot exceed array length");
		}

		// Base case
		if (select == 0) {
			return 0;

		// Recursive case
		} else {
			// ret could be 0 because of recursion, or because
			// of an initial call with 0. If it got that way
			// because of recursion, discard the value by returning
			// only the current length.  

			// We might have gotten 0 by hitting the base case,
			// or by receiving 0 as an initial argument. If it
			// was the base case, we ignore the 0 returned by
			// using only the length at this level. It will
			// still be returned as 0 if that was the original
			// value.
			int ret = permutations(length-1, select-1);
			if (ret==0) {
				return length;
			} else {
				return length * ret;
			}
		}	
	}

	public static void main(String[] args) {
		String[] drinks = {"Water", "Milk", "Soda", "Tea"};
		int result = permutations(drinks.length, 4);
		System.out.println(result); // Expect 24

		String[] produce = {"Apple", "Cabbage", "Lettuce",
		  "Orange", "Radish"};
		result = permutations(produce.length, 3);
		System.out.println(result); // Expect 60

		// Examples not provided by the exercise:

		// Only select one item from the available items
		result = permutations(produce.length, 1);
		System.out.println(result); // Expect 5

		// Select zero items from the available items
		result = permutations(produce.length, 0);
		System.out.println(result); // Expect 0

		// Have zero items, request zero items
		// Another possible answer would be that this throws an
		// exception, because it makes no sense to request permutations
		// out of a set of 0.
		result = permutations(0,0);
		System.out.println(result); // Expect 0
	}
}
