package CookieFactory;

public class CookieCutter {
    String shape;

    public CookieCutter(String shape) {
        this.shape = shape;
    }

    public Cookie cut(String flavor) {
        return new Cookie(this.shape, flavor);
    }
}
