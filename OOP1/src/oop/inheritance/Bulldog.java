package oop.inheritance;

public class Bulldog extends Dog {

    @Override
    public void bark() {
        System.out.println("Bulldog az másképp ugat...");
    }

    @Override
    public void bark(int volume) {
        System.out.println("Hangosabban ugatok...");
    }

    @Override
    public String toString() {
        return "Kutya neve: " + getName();
    }
}
