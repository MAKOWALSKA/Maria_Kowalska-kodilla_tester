public class LeapYear {
    public static boolean leap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year;
        year = 2020;

        if (leap(year)) {
            System.out.println("rok jest przestepny.");
        }
        else {
            System.out.println("rok nie jest przestepny.");
        }
    }
}
