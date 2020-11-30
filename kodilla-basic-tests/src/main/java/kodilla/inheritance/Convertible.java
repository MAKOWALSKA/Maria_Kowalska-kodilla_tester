package kodilla.inheritance;

public class Convertible extends Car {

    public Convertible(int wheels, int seats) {
        super(wheels, seats);
    }
    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }
    @Override
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
}
