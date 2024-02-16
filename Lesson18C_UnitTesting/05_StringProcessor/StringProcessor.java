/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

public class StringProcessor{
    
    private final String storedString;
    
    public StringProcessor(String input){
        this.storedString = new String(input);
    }
    
    public String addTogetherMirror(String inputString) {
        String combined = storedString.stripLeading() + inputString.stripTrailing();
        return combined;
    }

    public static String idProces(String firstName, String lastName, String petName, int year) {
        
        String petID = new String(String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0)) + String.valueOf(petName.charAt(0)) + String.valueOf(year));
        return petID;
    }

    public String secretCode(int offset) {

        String encodedString = new String();
        
        for (int i = 0; i < storedString.length(); i++){
            int newUnicode = storedString.charAt(i) + offset;
            encodedString.concat(String.valueOf(newUnicode));
        }
        
        return encodedString;
    }
    
    public String getStoredString(){
        return this.storedString;
    }

}

