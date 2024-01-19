package edu.ucalgary.oop.subclass;

public class ThreeClass {
	private int value;

	public ThreeClass(int number) {
		this.value = number;
	}

	public void output() {
		System.out.println("ThreeClass was instantiated with " +
		value);
	}
}
