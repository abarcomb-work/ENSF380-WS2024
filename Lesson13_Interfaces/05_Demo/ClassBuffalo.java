/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;
// Names used in this exercise are arbitrary but alphabetical. A for the first class, etc.
// Classes are named after animals and interfaces are named after vegetables.

public class ClassBuffalo implements InterfaceBeet {

    public static void main(String[] args) {
        ClassBuffalo theObject = new ClassBuffalo();
        System.out.println("ClassBuffalo implements InterfaceBeet. InterfaceBeet extends InterfaceAsparagus.");

        String explanation = "Method was abstract in InterfaceAsparagus. InterfaceBeet provides a default implementation, so it does not need to be realized in ClassBuffalo.";
        String returnValue = theObject.abstractMethod();
        String caller = "abstractMethod(ClassBuffalo)";
        String output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "A static method from InterfaceAsparagus may be accessed, even though InterfaceAsparagus is only available via InterfaceBeet.";
        returnValue = InterfaceAsparagus.staticMethod();
        caller = "staticMethod(ClassBuffalo)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "A method found in InterfaceAsparagus and InterfaceBeet is not overriden. The InterfaceBeet method is used, because InterfaceBeet is a more immediate interface to this class.";
        returnValue = theObject.defaultMethod();
        caller = "defaultMethod(ClassBuffalo)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "A field in InterfaceBeet is accessed via a ClassBuffalo object.";
        returnValue = theObject.THE_STRING;
        caller = "THE_STRING(ClassBuffalo)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

    }
}
