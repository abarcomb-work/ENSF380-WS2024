/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.*;
import java.util.stream.*;
  
public class AdvancedStreams {

        public static void main(String[] args) {
		List<Pet> pets = Arrays.asList(
			new Pet("Spot", "dog", 3),
			new Pet("Smudge", "cat", 5),
			new Pet("Bubbles", "fish", 1),
			new Pet("Trouble", "cat", 1),
			new Pet("Fluffy", "dragon", 600)
		);

		exampleCollect(pets);	
		System.out.println();
		exampleCollect2(pets);	
		System.out.println();
		exampleReduce(pets);
	}

        public static void exampleCollect(List<Pet> pets) {
		List<Pet> newList =
 			pets
				.stream()
				.filter(n -> n.name.startsWith("S"))
				.collect(Collectors.toList());

		System.out.println(newList);
	}

        public static void exampleCollect2(List<Pet> pets) {
		Map<Integer, List<Pet>> newList =
 			pets
				.stream()
				.collect(Collectors.groupingBy(p -> p.age));

		newList
			.forEach((age, pet) -> System.out.format("age %s: %s%n", age, pet));
	}

	public static void exampleReduce(List<Pet> pets) {
		Integer sumAges = pets
				.parallelStream()
				.reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);
		System.out.println(sumAges);
	}

}


class Pet {
	String name;
	String type;
	int age;

	Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String toString() {
		return name + " ("  + type + ")";
	}
}
