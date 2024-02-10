/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

// Names used in this exercise are arbitrary but alphabetical. A for the first class, etc.
// Classes are named after animals and interfaces are named after vegetables.
package edu.ucalgary.oop;

public class ClassAardvark implements InterfaceAsparagus {

    @Override
    public String abstractMethod() {
        return "abstractMethod(ClassAardvark)";
    }

    @Override
    public String defaultMethod() {
        return "defaultMethod(ClassAardvark)";
    }

    public static void main(String[] args) {
        ClassAardvark theObject = new ClassAardvark();
        System.out.println("ClassAardvark realizes InterfaceAsparagus.");

        String explanation = "Abstract method from InterfaceAsparagus must be realized in ClassAardvark.";
        String returnValue = theObject.abstractMethod();
        String caller = "abstractMethod(ClassAardvark)";
        String output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "Static method from InterfaceAsparagus is accessed via interface name.";
        returnValue = InterfaceAsparagus.staticMethod();
        caller = "staticMethod(ClassAardvark)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "A default method from InterfaceAsparagus is overridden. This was by choice, not requirement.";
        returnValue = theObject.defaultMethod();
        caller = "defaultMethod(ClassAardvark)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "A field in InterfaceAsparagus is accessed via interface name.";
        returnValue = theObject.THE_STRING; // a static variable, should normally be accessed via the Interface
        caller = "THE_STRING(ClassAardvark)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

    }

}
