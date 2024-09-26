package CookieFactory;

public class CookieFactory {

    public static void main(String[] a) {
        CookieCutter starCookieCutter = new CookieCutter("star");
        CookieCutter umbrellaCookieCutter = new CookieCutter("umbrella");

        Cookie starCookie = starCookieCutter.cut("vanilla");
        Cookie umbrellaCookie = umbrellaCookieCutter.cut("chocolate");

        starCookie.describe();
        System.out.println();
        umbrellaCookie.describe();
    }
}
