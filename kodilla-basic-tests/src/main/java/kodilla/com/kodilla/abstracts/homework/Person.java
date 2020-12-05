package kodilla.com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void process(Job job) {
        System.out.println(job.getResponsibilities());
    }
    public static void main(String[] args) {
        SoftwareDeveloper SoftwareDeveloper = new SoftwareDeveloper();
        Doctor Doctor = new Doctor();
        Teacher Teacher = new Teacher();

        Person personOne = new Person("Anna", 36,"teacher");
        personOne.process(Teacher);
        Person personTwo = new Person("Kamil", 45, "software developer");
        personTwo.process(SoftwareDeveloper);
        Person personThree = new Person("Alan", 50, "doctor");
        personThree.process(Doctor);
    }
}







