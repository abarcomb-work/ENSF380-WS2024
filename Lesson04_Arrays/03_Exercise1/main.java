/*
Copyright Ann Barcomb and Emily Marasco, 2021
Licensed under GPL v3
See LICENSE.txt for more information.
*/

  public static void main(String[] args){
       SimpleArrays myArray1 = new SimpleArrays();
       String foundResult1 = myArray1.arrayConcat();
       System.out.println(foundResult1);

       SimpleArrays myArray2 = new SimpleArrays();
       String foundResult2 = myArray2.arrayConcat(2);
       System.out.println(foundResult2);

       SimpleArrays myArray3 = new SimpleArrays("Hi you");
       String foundResult3 = myArray3.arrayConcat();
       System.out.println(foundResult3);

       SimpleArrays myArray4 = new SimpleArrays("Hi you");
       String foundResult4 = myArray4.arrayConcat(2);
       System.out.println(foundResult4);

       SimpleArrays myArray5 = new SimpleArrays("Hi you");
       String foundResult5 = myArray5.arrayCrop(0, 2);
       System.out.println(foundResult5);

       SimpleArrays myArray6 = new SimpleArrays("Hi you");
       String foundResult6 = myArray6.arrayCrop(3, 2);
       System.out.println(foundResult6);

       SimpleArrays myArray7 = new SimpleArrays("Hi you");
       String foundResult7 = myArray7.arrayCrop(0, 6);
       System.out.println(foundResult7);

       SimpleArrays myArray8 = new SimpleArrays("Hi you");
       String foundResult8 = myArray8.arrayCrop(3, 3);
       System.out.println(foundResult8);
  }
