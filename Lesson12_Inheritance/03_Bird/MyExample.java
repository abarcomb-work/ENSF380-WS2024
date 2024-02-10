/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

class Animal {
	private int age;

	public Animal(int age) {
		this.setAge(age);
	}

	public Animal() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Nom nom nom");
	}
}

class Bird extends Animal {
	private int wingspan;

	public Bird(int age) {
		super(age);
	}

	// This is an example of calling the superclass's
	// constructor without any arguments. The call to
	// super is required to ensure the object is properly
	// initialized. At least one constructor in the class
	// must call invoke super(), and the remainder must use
	// this() (or super()).
	// Note that if we failed to provide a constructor
	// Java would provide a default no argument one which
	// invokes super().
	public Bird() {
		super();
	}

	public Bird(int age, int wingspan) {
		super(age);
		this.setWingspan(wingspan);
	}

	public int getWingspan() {
		return this.wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

        @Override
	public void eat() {
		System.out.println("Peck, peck, peck!");
	}
}

public class MyExample {

	public static void  main(String[] args) {
		Bird cormorant = new Bird(3, 50);
		Bird chicken = new Bird();
		chicken.setWingspan(45);
		chicken.setAge(3);

		System.out.println("A cormorant is a bird "+
			"with a " + cormorant.getWingspan() +
			" centimeter wingspan.");

		System.out.println("A chicken is a bird "+
			"with a " + chicken.getWingspan() +
			" centimeter wingspan. They peck "
			+ "at food.");
		chicken.eat();
	}
}
