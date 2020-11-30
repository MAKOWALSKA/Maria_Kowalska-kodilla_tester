package kodilla.com.kodilla.abstracts.homework;

public abstract class Job {
    private static String salary;
    public static String responsibilities;

    public Job(String salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public static String getResponsibilities() {
        return responsibilities;
    }
    public abstract void writeResponsibilities();


}
