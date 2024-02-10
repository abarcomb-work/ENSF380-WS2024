/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;
// Names used in this exercise are arbitrary but alphabetical. A for the first class, etc.
// Classes are named after animals and interfaces are named after vegetables.

interface InterfaceCarrot {
    // public, static, and final
    String THE_STRING = "THE_STRING(InterfaceCarrot)";

    // public
    default String defaultMethod() {
        return "defaultMethod(InterfaceCarrot)";
    }

    // public and static
    static String staticMethod() {
        return "staticMethod(InterfaceCarrot)";
    }

    // public and abstract
    String abstractMethod();
}
