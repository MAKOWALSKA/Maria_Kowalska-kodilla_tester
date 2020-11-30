package kodilla.inheritance;

public class OperatingSystemCheck {
    public static void main(String[] args) {
        OperatingSystem operatingsystem = new OperatingSystem(1962);
        operatingsystem.turnOff();
        operatingsystem.turnOn();

        Linux linux = new Linux(1991);
        linux.turnOff();

        FreeBSD freeBSD = new FreeBSD(1993);
        freeBSD.turnOn();
    }
}
