/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class Factorial {
	public static int calculateFactorial(int num)	{
		if (num < 0) {
			throw new IllegalArgumentException(
			  "Factorial is not defined for negative numbers");
		}

		// By definition, 0! is 1.
		if (num == 0) {
			return 1;
		} 

		int product = 1;
		for (int i=1; i <= num; i++) {
			product *= i;	
		}

	        return product;
	}

	public static void main(String[] args) {
		int result = calculateFactorial(10);
		System.out.println(result);

                result = calculateFactorial(1);
                System.out.println(result);

                result = calculateFactorial(0);
                System.out.println(result);
	}
}
