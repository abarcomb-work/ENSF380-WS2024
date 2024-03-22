/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class Calc {
	public interface MathWithInts {
		public int operation(int a, int b);   
	}
  
	public int twoDigitOp(int a, int b, MathWithInts op) {
		return op.operation(a, b);
	}
 
	public static void main(String[] args) {
		MathWithInts addition = (a, b) -> a + b;
		MathWithInts subtraction = (a, b) -> a - b;
		MathWithInts division = (a, b) -> a / b;
		MathWithInts multiplication = (a, b) -> a * b;

		Calc myApp = new Calc();
		System.out.println("10 + 10 = " +
			myApp.twoDigitOp(10, 10, addition));
		System.out.println("9 - 10 = " +
			myApp.twoDigitOp(9, 10, subtraction));
		System.out.println("10 / 5 = " +
			myApp.twoDigitOp(10, 5, division));
		System.out.println("2 * 10 = " +
			myApp.twoDigitOp(2, 10, multiplication));	
	}
}
