
package edu.ucalgary.oop;
/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/

// Example output for Exercise 11.1
// See exercise sheet for instructions and corresponding files.

public class PetBookingSystem {

    public static void main(String[] args) {
        
        Client owner1 = new Client("Ellie May", "403-230-9902", "65 Cedarwood Cir NW");
        System.out.println(owner1.getName());
        System.out.println(owner1.getRewardsNumber());
        
        System.out.println("First attempt at enrolling in rewards a success?");
        System.out.println(owner1.enrollRewards("9809Z"));
        System.out.println("Second attempt at enrolling in rewards a success?");
        System.out.println(owner1.enrollRewards("2314579"));

        System.out.println(owner1.getRewardsNumber());
        System.out.println(owner1.getRewardsPoints());
        
        owner1.updatePoints(100);
        System.out.println(owner1.getRewardsPoints());
        
        System.out.println();
        
        Pet myPet = new Pet("Shadow", "Dog", "Golden Retriever", "Golden yellow", owner1);
                
        EmergVet vet = new EmergVet("Dr. Louise Hesco", "587-650-9988");
        
        System.out.println(myPet.getName());
        myPet.setVet(vet);
        System.out.println(myPet.getVet().getName());
        
        myPet.updateVaccineStatus(true);
        System.out.println(myPet.getVaccineStatus());
        
        System.out.println();
        
        String[] medList = {"NexGard", "Interceptor"};
        String medInstructions = "Give NexGard on Monday and Interceptor on Friday.";
        String foodInstructions = "1 cup of provided food twice daily.";
        
        myPet.setCare(medList, medInstructions, foodInstructions);
        
        System.out.println(myPet.getCareSummary());
        
        Employee manager1 = new Employee("Ray Long", "3490");
        Employee employee1 = new Employee("Aaron Woods", "9882", manager1.getIDNumber());
        Employee employee2 = new Employee("Penny Mase", "5116", manager1.getIDNumber());
        
        manager1.addEmployee(employee1);
        manager1.addEmployee(employee2);
        
        System.out.println();
        System.out.println("Employees of Manager 1:");
        
        Employee[] employeeList = manager1.getEmployees();
        
        for (int i = 0; i < employeeList.length; i++){
            if(employeeList[i] != null){
                System.out.println(employeeList[i].getName());
                System.out.println(employeeList[i].getIDNumber());
            }
        }

        System.out.println();
        
        Booking vacation = new Booking(myPet, employee1, "01-26-2022", "02-05-2022");
        
        ReportCard goodDog = new ReportCard(vacation);
        
        System.out.println(goodDog.printReport());
        
        System.out.println();
        System.out.println("End of example output.");
        
    }
    
}
