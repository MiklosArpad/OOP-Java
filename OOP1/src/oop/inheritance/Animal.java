package oop.inheritance;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

// SPECIALIZÁLÁS: közös ős -> mik közösek?
// utána jött a speckó típus: dog, parrot

// GENERALIZÁLÁS: előbb a speckó utána kigyűjtm egy ősosztálybmi közös ésörököltetek
