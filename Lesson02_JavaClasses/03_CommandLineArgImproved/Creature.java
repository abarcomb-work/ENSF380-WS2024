/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

/* 
Creature defines the structure of an animal.
*/

public class Creature {
    /**
    @param args Handles an optional command-line argument
    */
    public static void main(String[] args) {
        System.out.print("This is a placeholder for ");
        for (int i = 0; i < args.length; i++)
		System.out.print(args[i] + " ");
	System.out.println();
    }
}
