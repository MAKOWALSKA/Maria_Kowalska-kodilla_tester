public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book book = Book.of("Leo Tolstoy", "A Letter to a Hindu.");

        return book;
    }

}
