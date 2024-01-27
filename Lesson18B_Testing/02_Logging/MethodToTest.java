/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/


package edu.ucalgary.oop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// A simple class to demonstrate using a logger. Note that significant
// functionality is not available due to running without a build tool.
// To run this code, you will need to have a version of the commons-logging
// jar file in your classpath. 
// Important: You may not import org.apache.commons.logging.* packages in
// your submitted programs.
public class MethodToTest {
        private static Log logger = LogFactory.getLog("MethodToTest");
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
			logger.warn("sum = "+sum);
		}

		int product = first * second;
		if (this.verbosity >= 2) {
			logger.warn("product = "+product);
		}

		int sumMinusProduct = sum - product;
		if (this.verbosity >= 2) {
			logger.warn("sum minus product = "+sumMinusProduct);
		}

		if (sumMinusProduct < 1) {
			if (sumMinusProduct < -8) {
				if (this.verbosity >= 1) {
					logger.info("< 8; return 0");
				}
				return 0;
			}
			if (this.verbosity >= 1) {
				logger.info("< 1; return product - sum");
			}
			return product - sum;
		}	
		if (this.verbosity >= 1) {
			logger.info("return sum minus product");
		}
		return sumMinusProduct;
	}

	public MethodToTest(int verbosity) {
		this.verbosity = verbosity;
	}

	public MethodToTest() { }
}
