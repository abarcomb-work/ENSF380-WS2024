/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/


public class MethodToTest {
	// Take two integers. Subtract the product from the sum. Return
	// this number if it is positive. If it is below -8, return 0.
	// Otherwise, subtract the sum from the product and return that value.
	public static int subtractProductSum(int first, int second) {
		int sum = first + second;
		int product = first * second;
		int sumMinusProduct = sum - product;
		if (sumMinusProduct < 1) {
			if (sumMinusProduct < -8) {
				return 0;
			}
			return product - sum;
		}	
		return sumMinusProduct;
	}

	public static void main(String[] args) {
		// What if sum - product < 0?
		// Expected: product - sum
		System.out.print("-3, -2 should give 11. Gave: ");
		System.out.println(subtractProductSum(-3, -2));

		// What if sum - product = 0?
		// Expected: product - sum
		System.out.print("0, 0 should give 0. Gave: ");
		System.out.println(subtractProductSum(0, 0));

		// What if sum - product is < -8?
		// Expected: special case of 0
		System.out.print("10, 20 should give 0. Gave: ");
		System.out.println(subtractProductSum(10, 20));

	
		// What if sum - product = -8?
		// Expected: product - sum
		System.out.print("-2, -2 should give 8. Gave: ");
		System.out.println(subtractProductSum(-2, -2));
	}

}
