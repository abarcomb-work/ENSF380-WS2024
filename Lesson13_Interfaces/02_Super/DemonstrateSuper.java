/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

class ChildClassA implements ParentInterfaceA {

	// Demonstrate the use of Interface.super.methodName() - Interface
	public void display() {
		System.out.println("Method display called from ChildClassA");
		ParentInterfaceA.super.display();
	}
}

interface ParentInterfaceA {
	default void display() {
		System.out.println("Method display called from ParentInterfaceA");
	}
}


class ChildClassB extends ParentClassB {
	int x = 1;

	// Demonstrate the use of super() constructor - Inheritance
	public ChildClassB() {
		super();
	}

	public ChildClassB(int x) {
		super(x);
	}

	// Demonstrate use of super.methodName() - Inheritance
	public void display() {
		System.out.println("Method display called from ChildClassB");
		System.out.println("ChildClass x value: " + x); 
		System.out.println("ParentClass x value: " + super.x); 
		super.display(); 
	}


}

class ParentClassB {
	int x = 0;

	public ParentClassB() {
	}

	public ParentClassB(int x) {
		this.x = x;	
	}

	public void display() {
		System.out.println("Method display called from ParentClassB");
	}
}


public class DemonstrateSuper {
	public static void main(String args[]) {
		var childObjectA = new ChildClassA();
		childObjectA.display();
		System.out.println("");

		var childObjectB = new ChildClassB();
		System.out.println("No value supplied to constructor");
		childObjectB.display();
		System.out.println("");

		childObjectB = new ChildClassB(409);
		System.out.println("Value supplied to constructor");
		childObjectB.display();
	}
}
