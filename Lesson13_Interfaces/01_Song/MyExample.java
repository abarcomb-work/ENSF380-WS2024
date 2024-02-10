/*
Copyright Ann Barcomb and Emily Marasco, 2023-2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

// Example of an interface
interface PerformingArt {
	default String art() {
		return "Theater";
	}

	default String speed() {
		return "Slow";
	}
	
	static String welcome(){
		return "Welcome to the Performing Arts!";
	}
}

interface SoundStudio {
	default String studio() {
		return "Schulich Recording Studio";
	}
}

// Example of an interface extending an interface
interface Music extends PerformingArt {
	// All fields are static and final
	String INSTRUMENT = "Guitar";
	String KEY = "Minor";

        @Override
	default String art() {
		return "Music";
	}

	default String tempo() {
		return "Adagio";
	}
}


// Example of extending two interfaces
interface Recording extends PerformingArt, SoundStudio {
        @Override
	default String art() {
		return "Music!";
	}

	default double duration() {
		return 5.06;
	}

	// Abstract method
	String producer(); 
	
}

class Melody {
	public String tune() {
		return "la-la-la";
	}

	public String tone() {
		return "Sinusoidal waveform";
	}
}

// Example of implementing two interfaces
// and extending an object
class Song extends Melody implements Music, Recording {

        @Override
	public String tune() {
		return "dah-dah-dah-dum";
	}

        @Override
	public String art() {
		// Use a super interface's method
		return Recording.super.art();
	}

        @Override
	public String producer() {
		return "University of Calgary productions";
	}
}


public class MyExample {
	public static void main(String args[]) {
		var mySong = new Song();
		System.out.println("Art form is " + mySong.art());
		System.out.println("Instrument is " + mySong.INSTRUMENT);
		System.out.println("Tune is " + mySong.tune());
		System.out.println("Tone is " + mySong.tone());
		System.out.println("Key is " + mySong.KEY);
		System.out.println("Tempo is " + mySong.tempo());
		System.out.println("Studio is " + mySong.studio());
		System.out.println("Producer is " + mySong.producer());
		System.out.println("Duration is " + mySong.duration());
		System.out.println("Speed is " + mySong.speed());
		System.out.println(PerformingArt.welcome());
	}
}
