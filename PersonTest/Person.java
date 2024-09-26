package PersonTest;

public class Person {
    String name;
    int age;

    static int personCount = 0;

    public Person() {
        personCount++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++;
    }

    public void speak() {
        System.out.printf("Hello, my name is %s and I am %d years old.\n", this.name, this.age);
    }

    public static void displayCount() {
        System.out.println("No. of persons created: " + personCount);
    }
}
