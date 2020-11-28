import java.util.Random;
public class RandomNumbers {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int min = 31;
        int max = 0;
        int randomNumber;
        int sum = 0;
        while (sum < 5000) {
            randomNumber = random.nextInt(31);
            if(randomNumber < min) {
                min = randomNumber;
            }
            if (randomNumber > max)  {
                max = randomNumber;
            }
            sum = sum + randomNumber;
        }
        System.out.println("Sum " + sum);
        System.out.println("Min " + min);
        System.out.println("Max " + max);

    }
}

