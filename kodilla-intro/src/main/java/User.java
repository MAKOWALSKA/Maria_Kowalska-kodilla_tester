public class User {

     String name;
     int age;

    public User (String name, int age){
        this.name = name;
        this.age = age; }

    public String showName() {
        return name;
    }
    public int showAge() {
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
            sum=sum+users[i].showAge();
        }
        double average =(double) sum/users.length;
        for (int i=0; i<users.length; i++) {
            if ( users[i].showAge() < average ) {
                System.out.println(users[i].showName());
            }
        }
    }

}
