/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class Factorial {

	public static int calculateFactorial(int num) {
		if (num > 1) {
			return num * calculateFactorial(num - 1);
		} else {
			return 1;
		}
	}


	public static void main(String[] args) {
		int result = calculateFactorial(10);
		System.out.println(result);
	}
}
