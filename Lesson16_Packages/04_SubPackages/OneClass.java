/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

import edu.ucalgary.oop.*;
import edu.ucalgary.oop.subclass.ThreeClass;

public class OneClass {

	public static void main(String args[]) {
		TwoClass object = new TwoClass(2);
		object.output();

		ThreeClass third = new ThreeClass(200);
		third.output();
	}
}
