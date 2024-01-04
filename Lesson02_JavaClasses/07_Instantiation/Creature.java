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
        Animal myPet = new Animal();
        myPet.setAnimalType("mouse");
        Animal myWildlife = new Animal();
        myWildlife.setAnimalType("deer");

        System.out.println("I have a pet " + myPet.getAnimalType());
        System.out.println("I see a " + myWildlife.getAnimalType() + " outside");
    }
}

class Animal {
        private String animalType;

        public void setAnimalType(String arg) {
            animalType = arg;
        }
       
        public String getAnimalType() {
            return animalType;
        }
}
