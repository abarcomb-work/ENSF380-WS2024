/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;
// Names used in this exercise are arbitrary but alphabetical. A for the first class, etc.
// Classes are named after animals and interfaces are named after vegetables.

public class ClassDove extends ClassCobra implements InterfaceAsparagus {
    public static void main(String[] args) {
        ClassDove theObject = new ClassDove();
        System.out.println("ClassDove extends ClassCobra and implements InterfaceAsparagus. ClassCobra implements InterfaceCarrot and InterfaceBeet. InterfaceBeet extends InterfaceAsparagus.");

        String explanation = "Although it is abstract in InterfaceAsparagus, the method was implemented in the parent class, and that implementation is used.";
        String returnValue = theObject.abstractMethod();
        String caller = "abstractMethod(ClassDove)";
        String output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "The method is implemented in InterfaceAsparagus and in ClassCobra. The parent class implementation is used rather than the interface implementation.";
        returnValue = theObject.defaultMethod();
        caller = "defaultMethod(ClassDove)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

    }

}
