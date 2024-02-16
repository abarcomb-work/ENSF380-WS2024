/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

class NotGenericClass {
   public <T>void sampleMethod(T[] array) {
      for(int i=0; i<array.length; i++) {
         System.out.println(array[i]);
      }
   }
}

public class MyGenerics {
   public static void main(String args[]) {
      NotGenericClass myObject = new NotGenericClass();
      Integer intArray[] = {100, 90, 80};
      myObject.sampleMethod(intArray);
      String stringArray[] = {"One", "Two", "Three"};
      myObject.sampleMethod(stringArray);
   }
}
