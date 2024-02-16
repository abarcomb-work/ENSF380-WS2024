/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/

package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.Arrays;

public class Pet {
    
    private String name;
    private String species;
    private String breed;
    private int numLegs;
    private String colour;
    private String coveringType;
    private final int YEAR;
    private final int MONTH;
    private final int DAY;

    public Pet (String name, String species, String breed, int numLegs, String colour, String coveringType, int[] birthday) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.numLegs = numLegs;
        this.colour = colour;
        this.coveringType = coveringType;
        this.YEAR = birthday[0];
        this.MONTH = birthday[1];
        this.DAY = birthday[2];
    } 

    public int calculateAge(){
        
        ZoneId timeZone = TimeZone.getTimeZone("GMT-7").toZoneId();
        LocalDate currentDate = LocalDate.now(timeZone);

        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        
        int age = currentYear - YEAR;
        
        if (currentMonth < MONTH || (currentMonth == MONTH && currentDay < DAY))
            age--;
        
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setSpecies(String species){
        this.species = species;
    }
    
    public String getSpecies(){
        return this.species;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public String getBreed(){
        return this.breed;
    }

    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }
    
    public int getNumLegs(){
        return this.numLegs;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
    
    public String getColour(){
        return this.colour;
    }

    public void setCoveringType(String coveringType){
        this.coveringType = coveringType;
    }
    
    public String getCoveringType(){
        return this.coveringType;
    }

    public int getBirthYear(){
        return this.YEAR;
    }

    public int getBirthMonth(){
        return this.MONTH;
    }

    public int getBirthDay(){
        return this.DAY;
    }
    
}
