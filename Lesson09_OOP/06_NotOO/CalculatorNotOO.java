/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class CalculatorNotOO {

    public static double add(double one, double two) { return one + two; }
    public static double subtract(double one, double two) { return one - two; }
    public static double multiply(double one, double two) { return one * two; }
    public static double divide(double one, double two) { 
        if (two == 0) { return 0; }
        return one/two;
    }

    public static void main(String[] args) {
        double one = 9.0;
        double two = 0.1;
        System.out.println("Add: " + add(one, two));
        System.out.println("Subtract: " + subtract(one, two));
        System.out.println("Multiply: " + multiply(one, two));
        System.out.println("Divide: " + divide(one, two));
    }
}


