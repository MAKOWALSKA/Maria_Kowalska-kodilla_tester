import java.util.Scanner;

public class Colours {
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type colour's first letter:");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "R":
                    return "RED";
                case "W":
                    return "WHITE";
                case "B":
                    return "BLACK";
                case "Y":
                    return "YELLOW";
                default:
                    System.out.println("Wrong selection. Please type R for RED, W for WHITE, B for BLACK or Y for YELLOW. Thank you.");
            }
        }
    }

    public static void main(String[] args) {
        Colours calculator = new Colours();
        String result = calculator.getColour();
        System.out.println("Result: " + result);
    }
}
