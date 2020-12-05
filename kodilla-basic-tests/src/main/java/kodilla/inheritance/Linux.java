package kodilla.inheritance;

public class Linux extends OperatingSystem {

    public Linux(int year) {
        super(year);
    }
    @Override
    public void turnOn() {
        System.out.println("Linux is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Linux restarted and turned off");
    }
}
