/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

import java.util.Arrays;

public class ObjectCopying {

    public static void main(String[] args){

        CompetitionHorse horse1 = new CompetitionHorse("Horse","Equidae","Chordata","Blaze");
        String[] horse1Skills = new String[]{"Jumping", "Dressage"};
        horse1.setCompetitionHorseSkills(horse1Skills);
        horse1.setRider("Alex", 4321, 30);
        
		System.out.println("Original Horse1");
        System.out.println("Name: " + horse1.getCompetitionHorseName());
        System.out.println("Skills: " + Arrays.toString(horse1.skills));
        System.out.println("Rider: " + horse1.getRider().getRiderName());
		
        CompetitionHorse horse2 = new CompetitionHorse(horse1);
        horse2.setCompetitionHorseName("Thunder");
        horse2.setRider("Taylor", 1234, 25);
        String [] horse2Skills = new String[]{"Racing"};
        horse2.setCompetitionHorseSkills(horse2Skills);
        
		System.out.println();
		System.out.println("Horse1");
        System.out.println("Name: " + horse1.getCompetitionHorseName());
        System.out.println("Skills: " + Arrays.toString(horse1.skills));
        System.out.println("Rider: " + horse1.getRider().getRiderName());
		System.out.println("Horse2");
        System.out.println("Name: " + horse2.getCompetitionHorseName());
        System.out.println("Skills: " + Arrays.toString(horse2.skills));
        System.out.println("Rider: " + horse2.getRider().getRiderName());
		
    }   
}


class CompetitionHorse {
        private String animalSpecies;
        private String animalFamily;        
        private String animalPhylum;
        private String animalName;
        private Rider animalRider = new Rider();
        public String[] skills = new String[10];

        public CompetitionHorse(){
            
        }
                
        public CompetitionHorse(String animalSpecies, String animalFamily, String animalPhylum, String animalName)
        {
            this.animalSpecies = animalSpecies;
            this.animalFamily = animalFamily;
            this.animalPhylum = animalPhylum;
            this.animalName = animalName;
        }
		        
        public CompetitionHorse(CompetitionHorse origCompetitionHorse){
            this.animalSpecies = origCompetitionHorse.animalSpecies;
            this.animalFamily = origCompetitionHorse.animalFamily;
            this.animalPhylum = origCompetitionHorse.animalPhylum;
            this.animalName = origCompetitionHorse.animalName;
            this.skills = origCompetitionHorse.skills;
            this.animalRider = new Rider(origCompetitionHorse.animalRider);
        }

        public void setCompetitionHorsePhylum(String animalPhylum)
        {
            this.animalPhylum = animalPhylum;
        }

        public void setCompetitionHorseFamily(String animalFamily)
        {
            this.animalFamily = animalFamily;
        }

        public void setCompetitionHorseSpecies(String animalSpecies)
        {
            this.animalSpecies = animalSpecies;
        }

        public void setCompetitionHorseName(String animalName)
        {
            this.animalName = animalName;
        }
        
        public void setRider(String name, int regNumber, int age)
        {
            this.animalRider.setRiderName(name);
            this.animalRider.setRiderRegNumber(regNumber);
            this.animalRider.setAge(age);
            
        }

        public void setCompetitionHorseSkills(String[] skills)
        {
            this.skills = skills;
        }

        public String getCompetitionHorsePhylum() {
            return animalPhylum;
        }

        public String getCompetitionHorseFamily() {
            return animalFamily;
        }

        public String getCompetitionHorseSpecies() {
            return animalSpecies;
        }

        public String getCompetitionHorseName() {
            return animalName;
        }
        
        public Rider getRider(){
            return animalRider;
        }
        
}

class Rider{
        private String riderName;
        private int riderRegNumber;
        private int age;
        
        public Rider(){
            
        }
                
        public Rider(String riderName, int riderRegNumber, int age)
        {
            this.riderName = riderName;
            this.riderRegNumber = riderRegNumber;
            this.age = age;
        }

        public Rider(Rider inputRider){
            this.riderName = inputRider.riderName;
            this.riderRegNumber = inputRider.riderRegNumber;
            this.age = inputRider.age;
        }		
		
        public void setRiderName(String riderName)
        {
            this.riderName = riderName;
        }
        
        public void setRiderRegNumber(int riderRegNumber)
        {
            this.riderRegNumber = riderRegNumber;
        }
        
        public void setAge(int age)
        {
            this.age = age;
        }
        
        public String getRiderName() {
            return riderName;
        }

        public int getRiderRegNumber() {
            return riderRegNumber;
        }

        public int getAge() {
            return age;
        }      
}

  
