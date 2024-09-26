package BookChallenge;

public class Book {
    private String title;
    private String author;

    void showBookInfo() {
        System.out.println(title + " by " + author);
    }

    public static void main(String[] args) {
        Book a = new Book();
        a.title = "So Good They Can't Ignore You";
        a.author = "Cal Newport";

        a.showBookInfo();
    }
}
