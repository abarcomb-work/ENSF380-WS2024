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
        myPet.setAnimalKingdom("animalia");
        System.out.println(myPet.getAnimalType() + " is an " + myPet.getAnimalKingdom());

        myPet.setAnimalTypeKingdom("deer", "animalia");
        System.out.println(myPet.getAnimalType() + " is an " + myPet.getAnimalKingdom());
    }
}

class Animal {
        private String animalType;
        private String animalKingdom;

        public Animal(String animalType)
        {
            this.animalType = animalType;
        }

        public Animal()
        {
            this("mouse");
        }

        public void setAnimalTypeKingdom(String type, String kingdom)
        {
            this.setAnimalType(type);
            this.setAnimalKingdom(kingdom);
        }

        public void setAnimalKingdom(String kingdom)
        {
            this.animalKingdom = kingdom;
        }

        public void setAnimalType(String animalType)
        {
            this.animalType = animalType;
        }

        public String getAnimalType() {
            return animalType;
        }

        public String getAnimalKingdom() {
            return animalKingdom;
        }
}
  
