/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Shirt {
    private static final String SLEEVETYPES[] = {"short", "three-quarter", "long"};
    private Clothing fabric;
    private int sleeveType;

    public Shirt(String colour, String material, int sleeve) {
        this.fabric = new Clothing(colour, material);
        this.setSleeveType(sleeve);
    }

    public Shirt(int colour, String material, int sleeve) {
        this.fabric = new Clothing(colour, material);
        this.setSleeveType(sleeve);
    }

    public String getMaterial() { return this.fabric.getMaterial(); }
    public String getColour() { return this.fabric.getColour(); }
    public int getColourID() { return this.fabric.getColourID(); }
    public String getSleeveType() { return SLEEVETYPES[this.sleeveType]; }
    public void setMaterial(String material) { this.fabric.setMaterial(material); }
    public void setColour(String colour) { this.fabric.setColour(colour); }
    public void setColour(int colour) { this.fabric.setColour(colour); }
    public void setSleeveType(int sleeve) {
        if (sleeve < SLEEVETYPES.length) {
            this.sleeveType = sleeve;
        } else {
            this.sleeveType = 0;
        }
    }

    public static void main(String[] args) {
        var myShirt = new Shirt(2, "cotton", 2);
        System.out.printf("Colour: %s, Material: %s, Sleeve: %s\n", 
          myShirt.getColour(), myShirt.getMaterial(), myShirt.getSleeveType());
    }
}


