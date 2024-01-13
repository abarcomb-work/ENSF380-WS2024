/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Pants {
    private Clothing fabric;
    private int waistSize;
    private int legSize;

    public Pants(String colour, String material, int waist, int leg) {
        this.fabric = new Clothing(colour, material);
        this.waistSize = waist;
        this.legSize = leg;
    }

    public Pants(int colour, String material, int waist, int leg) {
        this.fabric = new Clothing(colour, material);
        this.waistSize = waist;
        this.legSize = leg;
    }

    public String getMaterial() { return this.fabric.getMaterial(); }
    public String getColour() { return this.fabric.getColour(); }
    public int getColourID() { return this.fabric.getColourID(); }
    public int getWaistSize() { return this.waistSize; }
    public int getLegSize() { return this.legSize; }

    public void setMaterial(String material) { this.fabric.setMaterial(material); }
    public void setColour(String colour) { this.fabric.setColour(colour); }
    public void setColour(int colour) { this.fabric.setColour(colour); }
    public void setHipSize(int leg) { this.legSize = leg; }
    public void setWaistSize(int waist) { this.waistSize = waist; }

    public static void main(String[] args) {
        var myPants = new Pants(1, "cotton", 34, 36);
        System.out.printf("Colour: %s, Material: %s, Waist: %d, Leg: %d\n", 
          myPants.getColour(), myPants.getMaterial(), myPants.getWaistSize(),
          myPants.getLegSize());
    }
}


