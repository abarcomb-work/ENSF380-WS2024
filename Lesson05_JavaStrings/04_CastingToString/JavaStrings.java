/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class JavaStrings {

    public static void main(String[] args) {
      
        Double speedRecord = 70.76;
        System.out.println("The fastest record for a horse is " + String.valueOf(speedRecord) + " km/h.");
        System.out.println("The fastest record for a horse is " + Double.toString(speedRecord) + " km/h.");
        System.out.println("The fastest record for a horse is " + 70.76 + " km/h.");
	}
}
