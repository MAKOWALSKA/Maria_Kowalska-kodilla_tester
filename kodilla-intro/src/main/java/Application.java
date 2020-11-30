public class Application {

    public static void checkPersonalData(String name, double age, double height) {
        if (name != null) {
            UserValidator userValidator = new UserValidator(name, age, height);
            if (userValidator.validateName()) {
                if (userValidator.validateAge() && userValidator.validateHeight()) {
                    System.out.println("User is older than 30 and higher than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
        }
    public static void main(String[] args) {
    checkPersonalData("Adam", 40.5, 178);
}
}

