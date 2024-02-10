/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

abstract class Animal {
	public void eat() {
		System.out.println("Method eat is supplied by Animal");
	}
}

abstract class Real extends Animal {
	public void isReal() {	
		System.out.println("Method isReal is supplied by Real");
	}
}

abstract class Swimmer extends Real {
	public void swim() {
		System.out.println("Method swim is supplied by Swimmer");
	}

	public abstract void breathe();
}


final class Trilobite extends Swimmer {
	public void isExtinct() {
		System.out.println("Method isExtinct is supplied by Trilobite");
	}

        @Override
	final public void breathe() {
		System.out.println("Method breathe is supplied by Trilobite");
	}
}

public class MyExample {
	public static void  main(String[] args) {
		Trilobite myTrilobite = new Trilobite();
		myTrilobite.swim();
		myTrilobite.eat();
		myTrilobite.isExtinct();
		myTrilobite.isReal();
		myTrilobite.breathe();


		/* The following code won't work as the class is abstract.
		var mySwimmer = new Swimmer();
		mySwimmer.swim();
		mySwimmer.eat();
		*/
	}


}
