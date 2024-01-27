/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class ExceptionExample {

	static public void main (String[] args) throws GreaterThanNineException {
		var example = new ExceptionExample();	
		example.lessThanTen(11);	
	}


	public void lessThanTen(int number) throws GreaterThanNineException {
		if (number >= 10) {
			throw new GreaterThanNineException();
		}
	}
}


class GreaterThanNineException extends Exception {
	public GreaterThanNineException() {
		super("Maximum value of number is 9.");
	}
}
