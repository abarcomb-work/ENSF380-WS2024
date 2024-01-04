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
    @param args Ignored command-line argument
    */
    public static void main(String[] args) {
        String myAnimalType = animal();
        System.out.println("This is a placeholder for Creature " + myAnimalType);
    }

    static String animal() {
        String animalType = "dog";
        return animalType;
    }
}

