package kodilla.com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor(String firstName, int age, String job) {
        super("medium", "to heal people");
    }

    public void writeResponsibilities() {
        System.out.println(getResponsibilities());
    }

}




