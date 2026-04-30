package ac.parrilla;

interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public AbstractShape(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    String color;
    double length;
    double width;
    double radius;

}

class Circle extends AbstractShape {

    public Circle(String color, double radius) {
        super(color, radius);
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }


    @Override
    public double calculatePerimeter() {
        return 0;
    }
}

public class Task15 {
}
