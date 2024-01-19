/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class JavaStrings {

    public static void main(String[] args) {
        
        String animalFact1 = "Horses are mammals.";
        String animalFact2 = "Horses are mammals.";
        String animalFact3 = new String("Horses are mammals.");
        String animalFact4 = new String ("Elephants are mammals.");

        System.out.println(animalFact1 == animalFact2);
        System.out.println(animalFact1 == animalFact3);
        System.out.println(animalFact1.equals(animalFact2));
        System.out.println(animalFact1.equals(animalFact3));
        System.out.println(animalFact1.equals(animalFact4));
        System.out.println(animalFact1.compareTo(animalFact2));
        System.out.println(animalFact1.compareTo(animalFact4));

    }
}
