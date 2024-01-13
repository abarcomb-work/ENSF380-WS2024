/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public static final boolean thisWillNotWork = true;

public class Example {
    public final int MAX_HEIGHT;
    public static int numObjects;

    public Example(int height) {
        // set maximum height for this object
        this.MAX_HEIGHT = height;

        // Increment numObjects every time an object is instantiated
        numObjects++;
    }

    public static void main(String[] args) {
        var myObj1 = new Example(6);
        System.out.println("Obj1 - Height: " + myObj1.MAX_HEIGHT +
           " NumObj: " + myObj1.numObjects);

        var myObj2 = new Example(98);
        System.out.println("Obj2 - Height: " + myObj2.MAX_HEIGHT +
           " NumObj: " + Example.numObjects);

        System.out.println("Obj1 - Height: " + myObj1.MAX_HEIGHT +
           " NumObj: " + numObjects);
		   
		System.out.println(thisWillNotWork);
    }
} 
