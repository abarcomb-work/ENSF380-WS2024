/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// Import statements are not required when we use the fully qualified names.
// import edu.ucalgary.oop.*;
// import edu.ucalgary.oop.layer.*;

public class OneClass {

	public static void main(String args[]) {
		var one = new edu.ucalgary.oop.TwoClass(2);
		one.output();

		var two = new edu.ucalgary.oop.layer.TwoClass(200);
		two.output();
	}
}
