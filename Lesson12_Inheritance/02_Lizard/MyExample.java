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

class Reptile extends Animal {
	private String scales;

	public Reptile(int age) {
		super(age);
	}

	public Reptile(int age, String scales) {
		super(age);
		setScales(scales);
	}

	
	public String getScales() {
		return this.scales;
	}

	public void setScales(String scales) {
		this.scales = scales;
	}
}


class Lizard extends Reptile {
	private int tailLength;
	private int tongueLength;

	public Lizard(int age) {
		super(age);
	}

	// Note that we are not required to create a constructor
	// which expects the variables in the same order as the
	// Reptile class, so long as we call the Reptile constructor
	// appropriately. Here it is not very useful, and confusing.
	public Lizard(String scales, int age) {
		super(age, scales);
	}

	public Lizard(String scales, int age, int tail, int tongue) {
		super(age, scales);
		this.setTailLength(tail);
		this.setTongueLength(tongue);
	}

	public void setTailLength(int tail) {
		this.tailLength = tail;
	}

	public int getTailLength() {
		return this.tailLength;
	}

	public void setTongueLength(int tongue) {
		this.tongueLength = tongue;
	}

	public int getTongueLength() {
		return this.tongueLength;
	}

	public void run() {
		System.out.println("🦎");
	}
}

public class MyExample {

	public static void  main(String[] args) {
		Lizard chameleon = new Lizard("multi-hued", 2);
		Lizard gecko = new Lizard("green", 1, 3, 1);

		System.out.println("Chameleons are " +
			chameleon.getScales() + " and " +
			"this one is " + chameleon.getAge() +
			" years old. Watch it run!");
		chameleon.run();

		System.out.println("This gecko is " + 
			gecko.getScales() + " and has a tail "
			+ gecko.getTailLength() + " centimeters long,"+
			" and a tongue of " +
			gecko.getTongueLength() + " centimeter.");
			gecko.eat();
	}
}
