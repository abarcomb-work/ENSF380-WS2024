/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class ExploreCharacter {
	private Character ourCharacter;

	public ExploreCharacter(Character myCharacter) {
		setCharacter(myCharacter);
	}

	public Character getCharacter() {
		return this.ourCharacter;
	}

	public void setCharacter(Character myCharacter) {
		this.ourCharacter = myCharacter;
	}

	public static void main(String[] args) {
		var exploreObject = new ExploreCharacter('\u00C3');
		var characterTest = exploreObject.getCharacter();

		char justChar = ('\u00C3');

 		// These both look the same
		System.out.println(characterTest);
		System.out.println(justChar);

		// Naïve approach to checking characters
		if ((justChar >= 'a' && justChar <= 'z') ||
  		  (justChar >= 'A' && justChar <= 'Z')) {
			System.out.println(justChar + " is a letter");
		} else {
			System.out.println(justChar + " is not a letter");
		}

		// Using a method of the Character class
		if (Character.isLetter(justChar)) {
			System.out.println(justChar + " is a letter");
		} else {
			System.out.println(justChar + " is not a letter");
		}

		System.out.println("Please think about Unicode from the start! 🥺");
	}
}
