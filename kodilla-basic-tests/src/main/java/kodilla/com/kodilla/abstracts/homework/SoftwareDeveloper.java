package kodilla.com.kodilla.abstracts.homework;

public class SoftwareDeveloper extends Job {

    public SoftwareDeveloper(String firstName, int age, String job) {
        super("high", "to create the software solutions");
    }
    public void writeResponsibilities() {
        System.out.println(getResponsibilities());
    }
}


