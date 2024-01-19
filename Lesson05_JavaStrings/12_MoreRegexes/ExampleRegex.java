/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

import java.util.regex.*;

public class ExampleRegex {

    public static void main(String[] args) {

    // Example task: Remove trailing whitespace
    // In the following examples, a # is added at the end of the line 
    // before printing to indicate where the string ends.
        
        // Example: one space at the end of the line
        String sentence = "Horses are mammals. ";
        System.out.println("Original: " + sentence + "#");
        sentence = removeTrailingWhitespace(sentence);
        System.out.println("Modified: " + sentence + "#");
       
        // Example: multiple spaces at the end of the line
        sentence = "Horses are mammals.                 ";
        System.out.println("Original: " + sentence + "#");
        sentence = removeTrailingWhitespace(sentence);
        System.out.println("Modified: " + sentence + "#");

        // Example: multiple spaces and a tab at the end of the line
        sentence = "Horses are mammals.             	";
        System.out.println("Original: " + sentence + "#");
        sentence = removeTrailingWhitespace(sentence);
        System.out.println("Modified: " + sentence + "#");

        // Example: no whitespace at the end of the line (regex will have
        // no effect)
        sentence = "Horses are mammals.";
        System.out.println("Original: " + sentence + "#");
        sentence = removeTrailingWhitespace(sentence);
        System.out.println("Modified: " + sentence + "#");

        // Example: whitespace in the middle of the line and the end. Only
        // whitespace at the end is removed.
        sentence = " Horses     are mammals.\n";
        System.out.println("Original: " + sentence + "#");
        sentence = removeTrailingWhitespace(sentence);
        System.out.println("Modified: " + sentence + "#");


    // Example task: Check if a number is a phone number.
       
       // Example: valid number, no spaces
       String number = "1231231234";
       boolean matched = isPhoneNumber(number);
       System.out.println(number + ": " + matched);

       // Example: valid number, spaces and dashes
       number = "123 123-1234";
       matched = isPhoneNumber(number);
       System.out.println(number + ": " + matched);

       // Example: valid number, periods
       number = "123.123.1234";
       matched = isPhoneNumber(number);
       System.out.println(number + ": " + matched);

       // Example: Invalid: extra digit
       number = "01231231234";
       matched = isPhoneNumber(number);
       System.out.println(number + ": " + matched);
 
       // Example: Invalid: extra divider character
       number = "123.123  1234";
       matched = isPhoneNumber(number);
       System.out.println(number + ": " + matched);

    }


    // This method takes a string and removes all surplus whitespace at the
    // end of the line. It returns the string without the whitespace.
    public static String removeTrailingWhitespace(String myLine) {
          myLine = myLine.replaceAll("\\s+$", "");
          return myLine;
    }

    // This method takes a possible phone number as input and returns
    // true if it is a phone number, false if it is not. The phone number
    // must consist of 3-3-4 digits, which may be separated by 0-1 
    // dashes, spaces, and periods.
    public static boolean isPhoneNumber(String inputNumber) {
        Pattern phonePat = Pattern.compile(
            "^\\d{3}[\\s.-]{0,1}\\d{3}[\\s.-]{0,1}\\d{4}$");
        Matcher myMatcher = phonePat.matcher(inputNumber);
        return myMatcher.find();
    }
}
