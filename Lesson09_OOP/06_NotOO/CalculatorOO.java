/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class CalculatorOO {

    private double one;
    private double two;

    public double add() { return one + two; }
    public double subtract() { return one - two; }
    public double multiply() { return one * two; }
    public double divide() { 
        if (two == 0) { return 0; }
        return one/two;
    }

    // Constructor
    public CalculatorOO(double one, double two) {
        this.one = one;
        this.two = two;
    }


    public static void main(String[] args) {
        double one = 9.0;
        double two = 0.1;
        var calculator = new CalculatorOO(one, two);
        System.out.println("Add: " + calculator.add());
        System.out.println("Subtract: " + calculator.subtract());
        System.out.println("Multiply: " + calculator.multiply());
        System.out.println("Divide: " + calculator.divide());
    }
}


