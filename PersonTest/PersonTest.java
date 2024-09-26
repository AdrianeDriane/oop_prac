package PersonTest;

public class PersonTest {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 18);
        Person jill = new Person("Jill", 18);
        Person adriane = new Person("Adriane", 19);

        jack.speak();
        jill.speak();
        adriane.speak();

        new Person();
        Person.displayCount();
    }
}
