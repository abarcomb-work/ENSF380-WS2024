/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

import java.time.LocalDate;

public class JavaStrings {

    // A method to interpolate the date without String formatting
    public static String withoutFormatting(String before, String after, int day) {
        return before + day + after;
    }

    // A method to interpolate the date with String formatting
    public static String withFormatting(String sentence, int day) {
        return String.format(sentence, day);
    }

    public static void main(String[] args) {
        /* Examples of standard interpolation and simple formatted output */
        
        int ageCat = 3;
        int ageDog = 2;

        // Standard interpolation, printing and String construction.
        System.out.print("My cat is " + ageCat + " years old.\n");
        String dog = "My dog is " + ageDog + " years old.";
        System.out.println(dog);

        // Formatted output, printing and String construction.
        System.out.printf("My cat is %d years old.\n", ageCat);
        dog = String.format("My dog is %d years old.", ageDog);
        System.out.println(dog);



        /* Examples of working with a String with an unknown number location */

        int day = 5;

        // Something about the String is unknown - without formatted output
        String englishBefore = "Today is January ";
        String englishAfter = "th.";
        String deutschBefore = "Heute ist der ";
        String deutschAfter = ". Januar";
        System.out.println(deutschBefore + day + deutschAfter);
        System.out.println(withoutFormatting(englishBefore, englishAfter, 5));
        
        // Something about the String is unknown - with formatted output
        String english = "Today is January %dth.";
        String deutsch = "Heute ist der %d. Januar.";
        System.out.println(String.format(deutsch, day));
        System.out.println(withFormatting(english, 5));


        /* Examples of using optional modifiers */

        // Use at least 3 characters to print the digit (space padding)
        // The "3" specifies the number of characters (width).
        System.out.printf("The number is %3d.\n", 500); 
        System.out.printf("The number is %3d.\n", 5);
        System.out.printf("The number is %3d.\n", 5000); 

        // Use at least 2 characters to print the digit (0 padding)
        // The "2" specifies the number of characters (width).
        // The "0" specifies the padding (flag).
        System.out.printf("The number is %02d.\n", 6); 
        System.out.printf("The number is %02d.\n", 60); 
        System.out.printf("The number is %02d.\n", 600); 

        // Use at least 4 characters to print the digit (left justify)
        // The "4" specifies the number of characters (width).
        // The "-" specifies left justification (flag).
        System.out.printf("The number is %-4d.\n", 1); 
        System.out.printf("The number is %-4d.\n", 10); 
        System.out.printf("The number is %-4d.\n", 10001); 

        // Limit the output to 1 digit after the decimal point (truncate)
        // The .1 specifies the number of characters after the decimal (precision).
        System.out.printf("The number is %.1f\n", 5.5);
        System.out.printf("The number is %.1f\n", 5.51);
        System.out.printf("The number is %.1f\n", 5.56);

        // Format the integer using commas as a separator
        // The , indicates the delimiter (flag). 
        System.out.printf("The number is %,d\n", 10000);
    }
}
