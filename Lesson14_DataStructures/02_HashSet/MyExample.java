/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.*;

public class MyExample {
    public static void main(String args[]) {
        Integer arrayYears[] = {2021, 1927, 1066};
        Set<Integer> years = new HashSet<>(Arrays.asList(arrayYears));
        years.add(1859);

        System.out.println("Years: ");
        Iterator <Integer> it = years.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
