/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// This is an example of a manual implementation of logging.

import java.util.regex.*;

public class MainTest {
	private static String log = "[INFO] %s\n";
	private static int verbosity = 0;
	private static Pattern myPattern = Pattern.compile("v", Pattern.CASE_INSENSITIVE);

	// Can be run without arguments, in which case only the output of
	// the tests in main() is given. If the -v flag is provided, logging
	// level is set to 1, and more information is provided. If -vv or 
	// -v -v is given, logging is escalated and more information is given.
	public static void main(String[] args) {
		if (args.length > 0) {
			int matchCount = 0;

			for(int i=0; i < args.length; i++) {
				Matcher myMatch = myPattern.matcher(args[i]);
				while (myMatch.find()) {
					matchCount++;
				}
			}
			verbosity = matchCount;
		}

		MethodToTest obj = new MethodToTest(verbosity);

		// Expected: product - sum
		if (verbosity >= 1) {
			System.out.printf(log,"What if sum - product < 0?");
		}
		System.out.println("-3, -2 should give 11. Gave: " +
			obj.subtractProductSum(-3, -2));

		// Expected: product - sum
		if (verbosity >= 1) {
			System.out.printf(log,"What if sum - product = 0?");
		}
		System.out.println("0, 0 should give 0. Gave: " +
			obj.subtractProductSum(0, 0));

		// Expected: special case of 0
		if (verbosity >= 1) {
			System.out.printf(log,"What if sum - product is < -8?");
		}
		System.out.println("10, 20 should give 0. Gave: " +
			obj.subtractProductSum(10, 20));

	
		// Expected: product - sum
		if (verbosity >= 1) {
			System.out.printf(log,"What if sum - product = -8?");
		}
		System.out.println("-2, -2 should give 8. Gave: " +
			obj.subtractProductSum(-2, -2));
	}

}
