package oop.inheritance;

public class InheritanceAndPolymorphismPractise {
    public static void run() {
        /*
        Animal dog = new Dog(); // up-casting

        Animal parrot = new Parrot();

        if (dog instanceof Dog)
            ((Dog) dog).bark(); // down-casting

        // (FIZIKAI ÖRÖKLŐDÉS) -> extends

        // privát adattagok Animal: -> gyerek nem örökli a privát adattagot

        Zoo zoo = new Zoo();
        zoo.addAnimal(dog);
        zoo.addAnimal(parrot);
        */

        Dog dog = new Bulldog();
        dog.setName("Morzsa");
        // dog.bark();

        System.out.println(dog);
    }
}
