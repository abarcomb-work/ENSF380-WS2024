/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Shape {

    public static int numShapes;

    public static void numShapes(){
        
        if(Shape.numShapes == 1)
            System.out.println("There is currently " + Shape.numShapes + " shape.");
        else
            System.out.println("There are currently " + Shape.numShapes + " shapes.");
    }

    public static void main(String[] args) {
        Rectangle myShape1 = new Rectangle(5, 6);
        System.out.println("Shape1 - Height: " + myShape1.getMAX_HEIGHT() + " Shape1 - Width: " + myShape1.getMAX_WIDTH());
        System.out.println("Shape1 - Area: " + myShape1.calculateArea());
        System.out.println("Updated Rectangles: " + Rectangle.numRectangles);
        Shape.numShapes();
        System.out.println();

        Triangle myShape2 = new Triangle(5, 6);
        System.out.println("Shape2 - Height: " + myShape2.getMAX_HEIGHT() + " Shape2 - Width: " + myShape2.getMAX_WIDTH());
        System.out.println("Shape2 - Area: " + myShape2.calculateArea());
        System.out.println("Updated Triangles: " + Triangle.numTriangles);
        Shape.numShapes();
        System.out.println();

        Triangle myShape3 = new Triangle(7, 7);
        System.out.println("Shape3 - Height: " + myShape3.getMAX_HEIGHT() + " Shape3 - Width: " + myShape3.getMAX_WIDTH());
        System.out.println("Shape3 - Area: " + myShape3.calculateArea());
        System.out.println("Updated Triangles: " + Triangle.numTriangles);
        Shape.numShapes();
        System.out.println();
        
        // Why will this line fail?
        //System.out.println("All triangles must have an angle of: " + Triangle.ANGLE);
        
        System.out.println("All triangles must have an angle of: " + Triangle.getANGLE());

    }
} 

class Rectangle {
    private final int MAX_HEIGHT;
    private final int MAX_WIDTH;
    public static int numRectangles;

    public Rectangle(int height, int width) {
        // set maximum height and width for this object
        this.MAX_HEIGHT = height;
        this.MAX_WIDTH = width;

        // Increment numObjects every time an object is instantiated
        numRectangles++;
        Shape.numShapes++;
    }

    public double calculateArea(){
        return this.MAX_HEIGHT * this.MAX_WIDTH;
    }
    
    public int getMAX_HEIGHT(){
        return this.MAX_HEIGHT;
    }
    
    public int getMAX_WIDTH(){
        return this.MAX_WIDTH;
    }

// Try uncommenting this code- why does it create a compilation error?
/*
    public void setMAX_HEIGHT(int height){
        this.MAX_HEIGHT = height;
    }
*/
    
}

class Triangle {
    private final int MAX_HEIGHT;
    private final int MAX_WIDTH;
    public static int numTriangles;
    private static final int ANGLE = 90;

    public Triangle(int height, int width) {
        // set maximum height and width for this object
        this.MAX_HEIGHT = height;
        this.MAX_WIDTH = width;

        // Increment numObjects every time an object is instantiated
        numTriangles++;
        Shape.numShapes++;
    }
    
    public double calculateArea(){
        return this.MAX_HEIGHT * this.MAX_WIDTH / 2;
    }

    public int getMAX_HEIGHT(){
        return this.MAX_HEIGHT;
    }
    
    public int getMAX_WIDTH(){
        return this.MAX_WIDTH;
    }
    
    public static int getANGLE(){
        return Triangle.ANGLE;
    }
    
}
