/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;
// Names used in this exercise are arbitrary but alphabetical. A for the first class, etc.
// Classes are named after animals and interfaces are named after vegetables.

public class ClassCobra implements InterfaceCarrot, InterfaceBeet {
    @Override
    public String defaultMethod() {
        return InterfaceCarrot.super.defaultMethod() + " via (ClassCobra)";
    }

    @Override
    public String abstractMethod() {
        return InterfaceBeet.super.abstractMethod() + " via (ClassCobra)";
    }

    public static void main(String[] args) {
        ClassCobra theObject = new ClassCobra();
        System.out.println("ClassCobra implements InterfaceCarrot and InterfaceBeet. InterfaceBeet extends InterfaceAsparagus.");

        String explanation = "A default implementation of the method is provided in InterfaceBeet, but InterfaceCarrot has an abstract version. Because InterfaceBeet and InterfaceCarrot are equally distant from the class, ClassCobra must implement the method. It is implemented by using super to reference the InterfaceBeet version.";
        String returnValue = theObject.abstractMethod();
        String caller = "abstractMethod(ClassCobra)";
        String output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "A method is found in both InterfaceCarrot and InterfaceBeet. ClassCobra must resolve this conflict by overriding. ClassCobra uses super to access the version in InterfaceCarrot.";
        returnValue = theObject.defaultMethod();
        caller = "defaultMethod(ClassCobra)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

        explanation = "Conflict with fields can be avoided by using the interface name to access them.";
        returnValue = InterfaceCarrot.THE_STRING;
        caller = "THE_STRING(ClassCobra)";
        output = String.format("* %s:  Caller %s, returned %s", explanation, caller, returnValue);
        System.out.println(output);

    }

}
