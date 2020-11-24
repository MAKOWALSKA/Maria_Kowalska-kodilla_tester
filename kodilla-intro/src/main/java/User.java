public class User {

    private String name;
    private int age;

    public User (String name, int age){
        this.name = name;
        this.age = age; }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] agrs) {

        User maria = new User("Maria", 33);
        User dawid = new User("Dawid", 34);
        User paulina = new User("Paulina", 29);
        User dominik = new User("Dominik", 2);
        User adam = new User("Adam", 1);

        User[] users = {maria, dawid, paulina, dominik, adam};

        int sum=0;
        for (int i=0; i<users.length; i++){
            sum=sum+users[i].getAge();
        }
        double average =(double) sum/users.length;
        for (int i=0; i<users.length; i++) {
            if ( users[i].getAge() < average ) {
                System.out.println(users[i].getName());
            }
        }
    }

}
