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
    @param args Handles a single command-line argument
    */
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("You must supply a command-line argument");
        } else {
            System.out.println("This is a placeholder for Creature " + args[0]);
        }
    }
}
