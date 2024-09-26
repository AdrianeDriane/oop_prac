package BookChallenge;

public class Book {
    private String title;
    private String author;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
    }

    void showBookInfo() {
        System.out.println(title + " by " + author);
    }

    public static void main(String[] args) {
        Book a = new Book();

        a.showBookInfo();
    }
}
