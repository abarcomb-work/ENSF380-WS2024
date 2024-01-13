/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Example
{

    public void increment() {
        int base = 6;
        for (int i = 0; i < 5; i++) {
            int temp = base + i;
            System.out.println(temp);
        }
    }    

    public static void main(String args[])
    {
        Example test = new Example();
        test.increment();
    }
}

