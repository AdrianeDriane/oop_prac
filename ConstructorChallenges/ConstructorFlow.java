package ConstructorChallenges;

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }

    Parent(int x) {
        System.out.println("Parameterized Parent Constructor" + x);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }

    Child(int x) {
        super(x);
        System.out.println("Parameterized Child Constructor" + x);
    }
}

public class ConstructorFlow {
    public static void main(String[] args) {
        new Child(1);
    }
}
