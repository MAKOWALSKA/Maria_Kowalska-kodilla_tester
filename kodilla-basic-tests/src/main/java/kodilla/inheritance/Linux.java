package kodilla.inheritance;

public class Linux extends OperatingSystem {

    public Linux(int year) {
        super(year);
    }

    public void turnOn() {
        System.out.println("System is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("System restarted and turned off");
    }
}
