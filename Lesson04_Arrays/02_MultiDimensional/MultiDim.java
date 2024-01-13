/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class MultiDim {

    public static void main(String[] args) {

        // Declaring a two-dimensional array
        String nested[][] = { {"Apple", "Bread", "Corn"}, {"Aardvark", "Buffalo"} };

        // Iterating over the arrays
        for(int i=0; i < nested.length; i++) {
            for(int j=0; j < nested[i].length; j++) {
                System.out.println("nested[" + i + "][" + j + "] " + nested[i][j]);
            }
        }   

        System.out.println();
        // Demonstrate changing the second value of the first "column"
        nested[0][1] = "Banana";
        for(int i=0; i < nested.length; i++) {
            for(int j=0; j < nested[i].length; j++) {
                System.out.println("nested[" + i + "][" + j + "] " + nested[i][j]);
            }
        } 

        System.out.println();
        // Demonstrate dynamic allocation
        int intNested[][][];

        // Outermost array length is 2; each element references an array of length 2
        intNested = new int[2][2][];

        // Set the length of each of the arrays which contains ints
        intNested[0][0] = new int[3];
        intNested[0][1] = new int[4];
        intNested[1][0] = new int[5];
        intNested[1][1] = new int[1];
        for(int i=0; i < intNested.length; i++) {
            for(int j=0; j < intNested[i].length; j++) {
                for(int k=0; k< intNested[i][j].length; k++) {
                    System.out.print("intNested[" + i + "][" + j + "][" + k + "] ");
                    System.out.println(intNested[i][j][k]);
                }
            }
        } 
        

    }

}
  
