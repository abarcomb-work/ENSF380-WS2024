/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// This is an example of a manual implementation of logging.


public class MethodToTest {
	private static String info = "[INFO] %s\n";
	private static String warn = "[WARNING] %s\n";
	private int verbosity = 0;

	// Take two integers. Subtract the product from the sum. Return
	// this number if it is positive. If it is below -8, return 0.
	// Otherwise, subtract the sum from the product and return that value.
	// Intermediate values are only given if a high level of verbosity
	// is requested. The case that is triggered will output at a lower
	// level of verbosity.
	public int subtractProductSum(int first, int second) {

		int sum = first + second;
		if (this.verbosity >= 2) {
			System.out.printf(warn,"sum = "+sum);
		}

		int product = first * second;
		if (this.verbosity >= 2) {
			System.out.printf(warn,"product = "+product);
		}

		int sumMinusProduct = sum - product;
		if (this.verbosity >= 2) {
			System.out.printf(warn,"sum minus product = "+sumMinusProduct);
		}

		if (sumMinusProduct < 1) {
			if (sumMinusProduct < -8) {
				if (this.verbosity >= 1) {
					System.out.printf(info,"< 8; return 0");
				}
				return 0;
			}
			if (this.verbosity >= 1) {
				System.out.printf(info,"< 1; return product - sum");
			}
			return product - sum;
		}	
		if (this.verbosity >= 1) {
			System.out.printf(info,"return sum minus product");
		}
		return sumMinusProduct;
	}

	public MethodToTest(int verbosity) {
		this.verbosity = verbosity;
	}

	public MethodToTest() { }
}
