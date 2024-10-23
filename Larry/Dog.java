package Larry;

public class Dog {
    private String breed = "aspin";
    private String color;
    private int age;

    void bark() {
        System.out.println("Arf");
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getBreed() {
        return this.breed;
    }

    void setBreed(String breed) {
        if (breed.isEmpty()) {
            return;
        }
        this.breed = breed;
    }
}
