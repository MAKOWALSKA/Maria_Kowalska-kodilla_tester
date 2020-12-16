package kodilla.com.kodilla.abstracts.homework;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return PI*radius*2;
    }
}
