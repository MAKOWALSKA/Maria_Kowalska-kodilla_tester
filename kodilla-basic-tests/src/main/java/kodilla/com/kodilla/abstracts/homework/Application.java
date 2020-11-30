package kodilla.com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println("circle area is " + circle.getArea());
        System.out.println("circle perimeter is " + circle.getPerimeter());


        Square square = new Square(8);
        System.out.println("square area is " + square.getArea());
        System.out.println("square perimeter is " + square.getPerimeter());

        Rhombus rhombus = new Rhombus(10,8);
        System.out.println("rhombus area is " + rhombus.getArea());
        System.out.println("rhombus perimeter is " + rhombus.getPerimeter());

        }
    }
