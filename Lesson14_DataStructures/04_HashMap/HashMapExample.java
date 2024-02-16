/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.*;

public class HashMapExample {
    public static void main(String args[]) { 
        TreeSet<String> orderedSpices = new TreeSet <>();
        HashMap<String, String[]> spices = new HashMap<String, String[]>();

        // Add spices to HashMap
        spices.put("fenugreek", new String[] {"whole", "ground", "blue"});
        spices.put("cumin", new String[] {"black", "whole", "ground"});
        spices.put("nutmeg", new String[] {"whole", "ground", "mace"});
        spices.put("cinnamon", new String[] {"cassia", "true"});
        spices.put("pepper", new String[] {"long", "black", "green", "white", "pink"});

        // Remove spice from HashMap
        System.out.println("...Removing");
        String[] eliminated = spices.remove("nutmeg");
        System.out.println(Arrays.toString(eliminated));

        // See the keys we have
        System.out.println("...Keys");
        for (Map.Entry m : spices.entrySet()) {
            System.out.println(m.getKey());
        }

        // Use a foreach loop to access each key
        for(String key : spices.keySet()) {
            // Access the value associated with this key
            String[] array = spices.get(key);
            // Iterate over the value array 
            // Store in a TreeSet
            for (int i=0; i < array.length; i++) {
                String val = array[i];
                String mySpice = val + " " + key;
                orderedSpices.add(mySpice);
            }     
        }

        // Print sorted list of spices
        System.out.println("...Sorted list of spices");
        for(String s : orderedSpices) {
            System.out.println(s);
        }

    } 
}
