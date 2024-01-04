/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a>
@version    1.7
@since      1.0
*/

/*
Hello is a simple example program for lecture 01
*/

public class Hello {
    /**
    This prints "Hello" and the contents of a variable.
    @param args Optional command-line argument
    */
    public static void main(String[] args) {
        short exampleShort = 2;
		long exampleLong = 100100;
		float exampleFloat = 1;
        double exampleDouble = 2.03;
        System.out.println("Hello " + exampleShort + ", " + exampleLong);
        System.out.println(exampleFloat + ", " + exampleDouble);
    }
} // End of class declaration
