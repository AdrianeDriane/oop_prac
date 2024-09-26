package BookChallenge;

public class Book {
    private String title;
    private String author;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void showBookInfo() {
        System.out.println(title + " by " + author);
    }

    public static void main(String[] args) {
        Book a = new Book("So Good They Can't Ignore You", "Cal Newport");

        a.showBookInfo();
    }
}
