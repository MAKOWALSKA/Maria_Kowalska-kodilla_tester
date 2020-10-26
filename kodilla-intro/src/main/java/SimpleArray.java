public class SimpleArray {
    public static void main (String[] args) {
        String[] booksTitles = new String[5];
        booksTitles[0] = "The Garnet Bracelet";
        booksTitles[1] = "The Duel";
        booksTitles[2] = "War and Peace";
        booksTitles[3] = "Anna Karenina";
        booksTitles[4] = "The Idiot";
        String book = booksTitles[3];
        System.out.println(book);
        int numberOfElements = booksTitles.length;
        if (numberOfElements == 5) {
            System.out.println("Table includes 5 elements");
        }
    }

}
