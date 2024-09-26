package CookieFactory;

public class Cookie {
    String shape;
    String flavor;

    public Cookie(String shape, String flavor) {
        this.shape = shape;
        this.flavor = flavor;
    }

    public void describe() {
        System.out.printf("This is a %s shaped cookie and it has a %s flavor.", shape, flavor);
    }
}