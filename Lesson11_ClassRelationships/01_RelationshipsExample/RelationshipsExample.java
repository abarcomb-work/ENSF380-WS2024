/*
Copyright Ann Barcomb and Emily Marasco, 2023
Licensed under GPL v3
See LICENSE.txt for more information.
*/
package edu.ucalgary.oop;

public class RelationshipsExample{
 
    public static void main(String[] args) {
        
    //Build a new house.
    House newBuild = new House("Pat Neil", "123 Main St. NW", "cedar", "2010", 10.0, 6, 3, 4.5, "inset");

    //Purchase a new door.
    Door newDoor = new Door("metal","green");
    
    //Purchase a new bathtub.
    Bathtub newTub = new Bathtub("clawfoot","blue");

    //Make renovations.
    newBuild.buildDeck("wood", 37.5, "2021");
    newBuild.renovateBathroom("farmhouse", newTub);
    newBuild.updateRoof("asphalt", "2021");
    newBuild.replaceDoor("front", newDoor);
    
    //Find tenant(s).
    Tenant renter1 = new Tenant("Jordan Upton","engineer","587-289-1111");
    Tenant renter2 = new Tenant("Jamie Upton","teacher","403-787-2222",renter1);
    Tenant[] renterInfo = new Tenant[]{renter1, renter2};
    
    //Sign rental agreement.
    RentalAgreement contract = new RentalAgreement("January 2021", "June 2021", 2500.00, renterInfo, newBuild);
    contract.rentalSummary();
    RentalAgreementHardcopy legalCopy = new RentalAgreementHardcopy();
    legalCopy.printAgreement(contract);
    }    
}


class House {
    
    private String owner;
    private final String ADDRESS;
    private Roof houseRoof;
    private Kitchen houseKitchen;
    private Bathroom houseBathroom;
    private Door frontDoor;
    private Door backDoor;
    private Deck houseDeck;
    
    
	// Create a new house with default doors and no deck
    public House(String owner, String address, String roofMaterial, String roofInstalled, double kitchenArea, int kitchenSeats, int numAppliances, double bathroomArea, String sinkType){
        this.owner = owner;
        this.ADDRESS = address;
        this.houseRoof = new Roof(roofMaterial, roofInstalled);
        this.houseKitchen = new Kitchen(kitchenArea, kitchenSeats, numAppliances);
        this.houseBathroom = new Bathroom(bathroomArea, sinkType);
		this.frontDoor = new Door();
		this.backDoor = new Door();
    }

	// Create new house with custom doors and no deck
    public House(String owner, String address, String roofMaterial, String roofInstalled, double kitchenArea, int kitchenSeats, int numAppliances, double bathroomArea, String sinkType, Door frontDoor, Door backDoor){
        this.owner = owner;
        this.ADDRESS = address;
        this.houseRoof = new Roof(roofMaterial, roofInstalled);
        this.houseKitchen = new Kitchen(kitchenArea, kitchenSeats, numAppliances);
        this.houseBathroom = new Bathroom(bathroomArea, sinkType);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }
    
	// Update the roof material and year
    public void updateRoof(String roofMaterial, String roofInstalled){
        this.houseRoof = new Roof(roofMaterial, roofInstalled);
    }
    
	// Retrieve current roof installation year - this is set to a new value whenever the roof is updated through the setter in Roof
    public String getInstallationYear(){
        return this.houseRoof.getINSTALLATIONYEAR();
    }
    
	// Update the bathroom tub and sink
    public void renovateBathroom(String sinkType, Bathtub newTub){
        this.houseBathroom.addTub(newTub);
        this.houseBathroom.setSink(sinkType);
    }
 
	// Update the deck material and year
    public void buildDeck(String material, double area, String installationYear){
        this.houseDeck = new Deck(material, area, installationYear);
    }

	// Change the front or back door
    public void replaceDoor(String whichDoor, Door newDoor){
        if(whichDoor.equalsIgnoreCase("front")){
            this.frontDoor = newDoor;
        }else if(whichDoor.equalsIgnoreCase("back")){
            this.backDoor = newDoor;
        }
    }
    
	// Retrieve current owner
    public String getOwner(){
        return this.owner;
    }

	// Update current owner
    public void setOwner(String owner){
        this.owner = owner;
    }

	// Return the address - address cannot be changed, so no setter is needed
    public String getADDRESS(){
        return this.ADDRESS;
    }


	// Convention is to have getters for everything. Setters might not be needed depending on the functionality- in this case, most of the reno methods are the setters, but they are named for their behaviour.
    public Roof getRoof(){
        return this.houseRoof;
    }

    public Kitchen getKitchen(){
        return this.houseKitchen;
    }
	
    public Bathroom getBathroom(){
        return this.houseBathroom;
    }
    
	public Door getFrontDoor(){
        return this.frontDoor;
    }
    
	public Door getBackDoor(){
        return this.backDoor;    
	}
    
	public Deck getDeck(){
        return this.houseDeck;
    }
        
}


// Composition: A roof cannot exist without a house
class Roof{
    
    private final String MATERIAL;
    private final String INSTALLATIONYEAR;
    
    public Roof(String material, String installationYear){
        this.MATERIAL = material;
        this.INSTALLATIONYEAR = installationYear;
    }

    public String getINSTALLATIONYEAR(){
        return this.INSTALLATIONYEAR;
    }
    
    public String getMATERIAL(){
        return this.MATERIAL;
    }
}

// Composition: A deck cannot exist without a house
class Deck{
    
    private final String MATERIAL;
    private double area;
    private String installationYear;
    
    public Deck(String material, double area, String installationYear){
        this.MATERIAL = material;
        this.area = area;
        this.installationYear = installationYear;
        System.out.println("Enjoy your new deck!");
    }    
    
    public String getMATERIAL(){
        return this.MATERIAL;
    }
    
    public double getArea(){
        return this.area;
    }

    public void setArea(double area){
        this.area = area;
    }
    
    public String getInstallYear(){
        return this.installationYear;
    }

    public void setInstallYear(String installYear){
        this.installationYear = installYear;
    }

}

// Aggregation: Doors can be purchased and moved between houses- therefore, they are part of the house, but they can exist even if the house does not.
class Door{
    private final String MATERIAL;
    private final String COLOUR;
    
    public Door(){  
        this.MATERIAL = "wood";
        this.COLOUR = "white";
    }
    
    public Door(String material, String colour){
        this.MATERIAL = material;
        this.COLOUR = colour;
    }
    
    public String getMATERIAL(){
        return this.MATERIAL;
    }
    
    public String getCOLOUR(){
        return this.COLOUR;
    }
}

// Composition: A kitchen cannot exist without the house.
class Kitchen{

    private final double AREA;
    private int numSeats;
    private int numAppliances;
    
    public Kitchen(double area, int numSeats, int numAppliances){
        this.AREA = area;
        this.numSeats = numSeats;
        this.numAppliances = numAppliances;
    }
    
    public double getAREA(){
        return this.AREA;
    }
    
    public int getSeats(){
        return this.numSeats;
    }
    
	public void setSeats(int numSeats){
		this.numSeats = numSeats;
	}
	
    public int getNumAppliances(){
        return this.numAppliances;
    }

	public void setNumAppliances(int numAppliances){
		this.numAppliances = numAppliances;
	}

}

// Composition: A bathroom cannot exist without the house.
class Bathroom{

    private final double AREA;
    private String sinkType;
    private Bathtub tub;
    
    public Bathroom(double area, String sinkType){
        this.AREA = area;
        this.sinkType = sinkType;
    }

    public Bathroom(double area, String sinkType, Bathtub tub){
        this.AREA = area;
        this.sinkType = sinkType;
        this.tub = tub;
    }
    
    public void addTub(Bathtub newTub){
        this.tub = newTub;
        System.out.println("Enjoy your new tub!");        
    }
    
    public void setSink(String sinkType){
        this.sinkType = sinkType;
        System.out.println("New sink looks great!");        
    }
    
    public double getAREA(){
        return this.AREA;
    }
    
    public String getSinkType(){
        return this.sinkType;
    }
    
    public Bathtub getTub(){
        return this.tub;
    }
}


// Aggregation: Tubs can be purchased and moved between houses- therefore, they are part of the house, but they can exist even if the house does not.
class Bathtub{

    private final String TYPE;
    private final String COLOUR;
    
    public Bathtub(String type, String colour){
        this.TYPE = type;
        this.COLOUR = colour;
    }
    
    public String getTYPE(){
        return this.TYPE;
    }
    
    public String getCOLOUR(){
        return this.COLOUR;
    }
}

// Association: Tenants and houses have a relationship, but both can exist independently and are not part of each other.
class Tenant{
    
    private String name;
    private String occupation;
    private String phoneNumber;
    private Tenant houseContact;	// Reflexive Association: One tenant is responsible for the other tenants- this means some of the tenants will contain another tenant object. If the tenant IS the contact, that variable will remain null.
    
    public Tenant(String name, String occupation, String phoneNumber){
        this.name = name;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;        
    }

    public Tenant(String name, String occupation, String phoneNumber, Tenant houseContact){
        this.name = name;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
        this.houseContact = houseContact;
    }
    
    public String getName(){
        return this.name;
    }

	public void setName(String name){
		this.name = name;
	}
    
    public String getOccupation(){
        return this.occupation;
    }
    
	public void setOccupation(String occupation){
		this.occupation = occupation;
	}
	
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
	public void setPhoneNumber(String number){
		this.phoneNumber = number;
	}
	
    public Tenant getHouseContact(){
        return this.houseContact;
    }
	
	public void setHouseContact(Tenant contact){
		this.houseContact = contact;
	}
}


// Association class: Tenants and houses are linked using a rental agreement.
class RentalAgreement{
    
    private final String STARTDATE;
    private final String ENDDATE;
    private final double MONTHLYCOST;
    private final Tenant[] RENTERS;
    private final House RESIDENCE;
    
    public RentalAgreement(String startDate, String endDate, double monthlyCost, Tenant[] renters, House residence){
        this.STARTDATE = startDate;
        this.ENDDATE = endDate;
        this.MONTHLYCOST = monthlyCost;
        this.RENTERS = renters;
        this.RESIDENCE = residence;
    }
    
    public void rentalSummary(){
        System.out.println("The details of the agreement are as follows: ");
        System.out.println("Agreement is between: " + getBothParties());
        System.out.println("Begins: " + STARTDATE + " Ends: " + ENDDATE);
        System.out.println("Monthly cost: " + String.format("$%.2f", MONTHLYCOST));
        System.out.println("Roof was last updated: " + RESIDENCE.getInstallationYear());
        System.out.println();
    }
    
    public String getSTARTDATE(){
        return this.STARTDATE;
    }
    
    public String getENDDATE(){
        return this.ENDDATE;
    }
    
    public double getMONTHLYCOST(){
        return this.MONTHLYCOST;
    }
    
    public Tenant[] getRENTERS(){
        return this.RENTERS;
    }
    
    public House getRESIDENCE(){
        return this.RESIDENCE;
    }
    
    private String getBothParties(){
        
        StringBuilder allContractParties = new StringBuilder();
        
        allContractParties.append(RESIDENCE.getOwner());
        
        for(int i = 0; i < RENTERS.length; i++){
            allContractParties.append(" and " + RENTERS[i].getName());
        }
        return allContractParties.toString();
    }
}


// Dependency: RentalAgreementHardcopy relies on other objects to complete its behaviour. There's no printout without a rental agreement in the first place.
class RentalAgreementHardcopy{
        
    public void printAgreement(RentalAgreement agreement){
        // Not implemented...
        // Use file I/O and send to PDF...
    }
}

