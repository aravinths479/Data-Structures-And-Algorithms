package BYTS.Interface;

// Interface definition
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Classes implementing the interface
class Circle implements Shape {
    private double radius;

    // Constructor, getters, and setters

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor, getters, and setters

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using polymorphism
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call methods without knowing the specific implementation
        double circleArea = circle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
    }
}
