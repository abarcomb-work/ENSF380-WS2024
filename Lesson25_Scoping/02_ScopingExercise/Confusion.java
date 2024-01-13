/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Confusion
{
    static int one = 11;  
    private int two = 33; 

    public void methodOne(int one) 
    {
        System.out.println("one: " + one); 
        System.out.println("two: " + two); 
        System.out.println("this.one: " + this.one); 
        System.out.println("Confusion.one: " + Confusion.one); 

        Confusion test = new Confusion();
        two = 4444; 

        System.out.println("test.two: " + test.two); 
        System.out.println("this.two: " + this.two); 
        System.out.println("two: " + two); 

        this.two = 0;
        this.one = 202; 
    }
 
    public static void main(String args[])
    {
        Confusion test = new Confusion();
        Confusion nextTest = new Confusion();

        System.out.println("test.methodOne(5)"); 
        test.methodOne(5);

        System.out.println(""); 
        System.out.println("test.methodOne(6)"); 
        test.methodOne(6);

        System.out.println(""); 
        System.out.println("nextTest.methodOne(5000)"); 
        nextTest.methodOne(5000);

        System.out.println("");
        System.out.println("main()");
        System.out.println("Confusion.one: " + Confusion.one);
        System.out.println("one: " + one);
    }
}

