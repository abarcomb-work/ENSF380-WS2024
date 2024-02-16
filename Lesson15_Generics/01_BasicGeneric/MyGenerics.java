/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class MyGenerics {
   public static void main(String[] args) {
      ExampleGeneric<Integer> integerExampleGeneric = new ExampleGeneric<Integer>();
      ExampleGeneric<String> stringExampleGeneric = new ExampleGeneric<String>();

      Integer six = 6;
      String hi = "Hello, World";

      integerExampleGeneric.add(six);
      stringExampleGeneric.add(hi);

      System.out.println("Integer Value: " + integerExampleGeneric.get());
      System.out.println("String Value: " + stringExampleGeneric.get());
   }
}

class ExampleGeneric<T> {
   private T data;

   public void add(T data) {
      this.data = data;
   }

   public T get() {
      return data;
   }   
}
