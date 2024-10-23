package Larry;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog erwin = new Dog();

        System.out.println("Enter breed: ");
        erwin.setBreed(scan.nextLine());

        System.out.println("Enter color: ");
        erwin.setColor(scan.nextLine());

        System.out.println("Erwin Breed: " + erwin.getBreed());
        System.out.println("Erwin Color: " + erwin.getColor());
        erwin.bark();
    }
}