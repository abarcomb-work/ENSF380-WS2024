/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/


public class MainToTest {
	// Take two integers and return the difference between them
	public static int differenceNumbers(int first, int second) {
		// Stub code, method not implemented.
		return 1;
	}

	public static void main(String[] args) {

		// What if 'second' is bigger than 'first'?
		System.out.print("2, 3 should give 1. Gave: ");
		System.out.println(differenceNumbers(2,3));

		// What if both numbers are the same?
		System.out.print("34, 34 should give 0. Gave: ");
		System.out.println(differenceNumbers(34,34));

		// What if one number is negative? Is it seen as smaller?
		System.out.print("-1, 2 should give 3. Gave: ");
		System.out.println(differenceNumbers(-1,2));

		// What if both numbers are negative? Do we get the answer?
		System.out.print("-1, -2 should give 1. Gave: ");
		System.out.println(differenceNumbers(-1,-2));

	}

}
