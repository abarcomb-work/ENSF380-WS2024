/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class MyGenerics {
   public static void main(String[] args) {
      Integer six = 6;
      String aKey = "My Key";
      String aValue = "This is a value";

      ExampleGeneric<String,Integer> integerExampleGeneric = new ExampleGeneric<String, Integer>(aKey, six);
      ExampleGeneric<String, String> stringExampleGeneric = new ExampleGeneric<String, String>(aKey, aValue);


      System.out.println("Integer Key: " + integerExampleGeneric.getKey());
      System.out.println("Integer Value: " + integerExampleGeneric.getValue());
      System.out.println("String Key: " + stringExampleGeneric.getKey());
      System.out.println("String Value: " + stringExampleGeneric.getValue());
   }
}

class ExampleGeneric<K, T> {
   private K key;
   private T value;

   public ExampleGeneric (K first, T second) {
       this.key = first;
       this.value = second;
   }

   public K getKey() {
       return key;
   }

   public T getValue() {
       return value;
   }
}
