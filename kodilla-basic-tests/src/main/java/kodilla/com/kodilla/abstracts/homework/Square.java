package kodilla.com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }
}
