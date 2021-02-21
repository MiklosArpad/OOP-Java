package oop.encapsulation;

public final class Dog {
    private final String name = "Fifi"; // field-initializer DE constructorban szokás inicializálni field-et

    public String getName() {
        return name;
    }
}


/* final:

1) konstans def.: (const)
2) field újradefiniálásának megakadályozása (readonly)
3) örököltetés megakadályozása (sealed)
 */