/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Clothing {

    private int colour;
    private String material;
    private final static String COLOURS[] = {"black", "white", "yellow"};

    // Getters and setters
    public String getColour() { return COLOURS[this.colour]; }
    public String getMaterial() { return this.material; }
    public void setMaterial(String material) { this.material = material; }
    public void setColour(String colour) { 
        for (int i=0; i<COLOURS.length; i++) {
            if (colour.equals(COLOURS[i])) {
                this.colour = i;
            } else {
                this.colour = 0;
            }
        }
    }

    // Constructor
    public Clothing(String colour, String material) {
        this.setColour(colour);
        this.material = material;
    }


    public static void main(String[] args) {
        var garment = new Clothing("black", "cotton");
        System.out.printf("Colour: %s, Material: %s\n", 
          garment.getColour(), garment.getMaterial());
    }
}


