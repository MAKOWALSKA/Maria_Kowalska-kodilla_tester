package kodilla.inheritance;

public class FreeBSD extends OperatingSystem {

    public FreeBSD(int year) {
        super(year);
    }
@Override
    public void turnOn() {
        System.out.println("System updated and turned on");
    }
    public void turnOff(){
        System.out.println("System is turned off");
    }
}
