/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a>
@version    1.9
@since      1.0
*/

/*
From this exercise on, documentation will not be included in examples.
Adding documentation is the responsibility of the student.
Please refer to earlier examples for documentation.
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
        double doubNum = 25.5;
        int intNum = (int)doubNum;
        System.out.println("Integer value: " + intNum);
  		System.out.println("Double value: " + doubNum);
    }
} // End of class declaration
