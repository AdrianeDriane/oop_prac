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

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    void showBookInfo() {
        System.out.println(title + " by " + author);
    }

    public static void main(String[] args) {
        Book a = new Book("So Good They Can't Ignore You", "Cal Newport");
        Book b = new Book("Rich Dad Poor Dad");

        a.showBookInfo();
        b.showBookInfo();
    }
}
