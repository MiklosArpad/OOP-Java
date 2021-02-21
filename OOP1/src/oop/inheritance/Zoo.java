package oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            if (animal instanceof Parrot)
                ((Parrot) animal).canSpeak();
            System.out.println(animal);
        }
    }
}
