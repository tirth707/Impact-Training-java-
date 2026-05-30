package Day20;

abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public abstract double area();
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color); 
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
    
    public void displayDetails() {
        System.out.println("Shape: Rectangle");
        System.out.println("Colour: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Calculated Area: " + area());
    }
}

public class Main { 
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle("Blue", 4.0, 7.0);
        myRectangle.displayDetails();
    }
}
 