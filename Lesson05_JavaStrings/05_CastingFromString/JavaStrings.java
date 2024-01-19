/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class JavaStrings {

    public static void main(String[] args) {
      
        String elephantWeight = "6000";
        String babyElephantWeight = "100";

        int sumElephants = Integer.parseInt(elephantWeight) + Integer.parseInt(babyElephantWeight);
	System.out.println("Adult and baby weigh " + sumElephants + " kg.");
        sumElephants = Integer.valueOf(elephantWeight) + Integer.valueOf(babyElephantWeight);
	System.out.println("Adult and baby weigh " + sumElephants + " kg.");
    }
}
