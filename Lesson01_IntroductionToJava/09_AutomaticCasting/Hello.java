/**
@author     Firstname Lastname <a href="mailto:firstname.lastname@ucalgary.ca">firstname.lastname@ucalgary.ca</a>
@version    1.8
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
    int intNum = 25;
    double doubNum = intNum; // automatic cast

    System.out.println("Integer value: " + intNum);     
    System.out.println("Double value: " + doubNum);
  }
}

