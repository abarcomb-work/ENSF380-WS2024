/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.*;
  
public class ExerciseStream {
        public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(40);
		myList.add(300);
		myList.add(6);
		myList.add(-11);

		myList
			.stream()
			.map(n -> n * 4)
			.filter(n -> n <= 100)
			.sorted()
			.map(n -> addDigits(n))
			.forEach(n -> System.out.println(n));
	}

	public static int addDigits(int number) {
		int sum = 0;

		// It wasn't defined how we should handle negative numbers;
		// in this example we decided to take the absolute value and
		// continue
		if (number < 0) {
			number = Math.abs(number);
		}

		while (number > 0) {
			int mod = number % 10;
			sum += mod;
			number = number/10;
		}
		return sum;
	} 
}

