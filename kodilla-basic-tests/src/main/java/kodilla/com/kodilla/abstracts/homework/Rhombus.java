package kodilla.com.kodilla.abstracts.homework;

public class Rhombus extends Shape{
    private double height;
    private double length;

    Rhombus(double height, double length) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length*height;
    }

    @Override
    public double getPerimeter() {
        return 4*length;

    }
}
