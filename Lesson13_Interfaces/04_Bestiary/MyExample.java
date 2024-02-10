/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

interface Carnivore {
	default void hunt() {
		System.out.println("Method hunt supplied by Carnivore");
	}
}

interface Extinct {
	default void isExtinct() {
		System.out.println("Method isExtinct supplied by Extinct");
	}
}


class Animal {
	public void eat() {
		System.out.println("Method eat supplied by Animal");
	}
}

class Real extends Animal {
	public void isReal() {
		System.out.println("Method isReal supplied by Real");
	}
}

class Swimmer extends Real {
	public void swim() {
		System.out.println("Method swim supplied by Swimmer");
	}
}

class Dragon extends Animal implements Carnivore {
	public void fly() {
		System.out.println("Method fly supplied by Dragon");
	}
}

class Manticore extends Animal implements Carnivore {
}

class Elephant extends Real {
}

class Mouse extends Real {
}

class Beaver extends Swimmer {
}

class Capybara extends Swimmer {
}

class Scorpion extends Real implements Carnivore {
}

class Orca extends Swimmer implements Carnivore{
}

class Trilobite extends Swimmer implements Extinct {
}

class Smilodon extends Real implements Carnivore, Extinct{
}

class Allosaurus extends Real implements Carnivore, Extinct{
}

class Mastodon extends Real implements Extinct{
}



public class MyExample {
	public static void main(String args[]) {
		var myAllosaurus = new Allosaurus();
		var myBeaver = new Beaver();
		var myCapybara = new Capybara();
		var myDragon = new Dragon();
		var myElephant = new Elephant();
		var myManticore = new Manticore();
		var myMastodon = new Mastodon();
		var myMouse = new Mouse();
		var myOrca = new Orca();
		var myScorpion = new Scorpion();
		var mySmilodon = new Smilodon();
		var myTrilobite = new Trilobite();

		System.out.println("...Allosaurus can call:");
		myAllosaurus.eat();
		myAllosaurus.isReal();
		myAllosaurus.hunt();
		myAllosaurus.isExtinct();

		System.out.println("...Trilobite can call:");
		myTrilobite.eat();
		myAllosaurus.isReal();
		myTrilobite.swim();
		myTrilobite.isExtinct();
	}
}
