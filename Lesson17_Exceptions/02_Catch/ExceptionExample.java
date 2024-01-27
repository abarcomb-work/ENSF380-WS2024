/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class ExceptionExample {

	static public void main (String[] args) {
		var example = new ExceptionExample();	

		int answer = example.divide(5, 0);	
		System.out.println("Answer was: " + answer);

		System.out.println();
		answer = example.divide(5, 1);	
		System.out.println("Answer was: " + answer);

		System.out.println();
		answer = example.divide(2, 1);	
		System.out.println("Answer was: " + answer);
	}


	public int divide(int number, int divisor) {

		int answer;

		// First exception.
		try {
			answer = number / divisor;	
		}

		catch(ArithmeticException e) {
			System.out.println("Caught an arithmetic error " + e.getMessage());
			return 100;
		}

		// Second exception. Two different attempts to catch it.
		try {
			if (number > 2) {
				throw new IllegalArgumentException("Number is greater than 2");
			}
		}

		catch(ArithmeticException e) {
			System.out.println("Caught an arithmetic error " + e.getMessage());
			return 100;
		}

		catch(Exception e) {
			System.out.println("Caught an exception: " + e.getMessage());
			return 200;
		}

		finally {
			System.out.println("The finally block was executed.");
			return 300;
		}
	}
}

