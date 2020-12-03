package kodilla.inheritance;

public class FreeBSD extends OperatingSystem {

    public FreeBSD(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("FreeBSD updated and turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("FreeBSD is turned off");
    }
}
