package kodilla.com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher(String firstName, int age, String job) {
        super("low", "to teach kids");
    }
    @Override
    public void writeResponsibilities() {
        System.out.println(getResponsibilities());

    }

}


