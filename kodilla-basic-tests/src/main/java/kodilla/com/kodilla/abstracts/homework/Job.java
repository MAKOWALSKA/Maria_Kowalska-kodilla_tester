package kodilla.com.kodilla.abstracts.homework;

public abstract class Job {
    private String salary;
    private String responsibilities;

    public Job(String salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
    public String getResponsibilities() {
        return responsibilities;
    }
}
