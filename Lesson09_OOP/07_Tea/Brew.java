/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Brew {
    public static void main(String[] args) {

        System.out.println("\nBrewing a new pot of tea...");
        var teapot = new TeaPot();
        teapot.printWaterStatus();
        teapot.addWater();
        teapot.printWaterStatus();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();
        teapot.removeTeabag();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();

        System.out.println("\nBrewing a new pot of tea...");
        teapot = new TeaPot("lapsang souchong");
        teapot.printWaterStatus();
        teapot.addWater();
        teapot.printWaterStatus();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();
        teapot.removeTeabag();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();

        System.out.println("\nBrewing a new pot of tea...");
        teapot = new TeaPot("Nilgiri silver-tip", "India");
        teapot.printWaterStatus();
        teapot.addWater();
        teapot.printWaterStatus();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();
        teapot.removeTeabag();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();

        System.out.println("\nBrewing a new pot of tea...");
        teapot = new TeaPot("hand-rolled black", "Georgia", "Teamania");
        teapot.printWaterStatus();
        teapot.addWater();
        teapot.printWaterStatus();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();
        teapot.removeTeabag();
        teapot.printTeabagStatus();
        teapot.printTeabagDetails();

    }
}
