package kodilla.com.kodilla.abstracts.homework;
public class Person {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anna", 34, "Teacher");
        System.out.println("Anna's job responsibilities is " + (Teacher.getResponsibilities()));

        Doctor doctor = new Doctor("Kamil", 50, "Doctor");
        System.out.println("Kamil's job responsibilities is " + (Doctor.getResponsibilities()));

        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper("Alan", 40, "SoftwareDeveloper");
        System.out.println("Alan job responsibilities is " + (SoftwareDeveloper.getResponsibilities()));

    }
}








