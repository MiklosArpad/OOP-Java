package oop.encapsulation;

import oop.encapsulation.Dog;

public class ImmutableGyakorlas {
    public static void futtatas() {
        /*
        // Immutable -> megváltoztathatatlan az állapota ...
        // legismertebb immutable class: String

        // s1 -> stacken memóriacímet (referenciát) tárol ...
        String s1 = new String("Árpád");
        s1 = "Bence"; // = new String("Bence); ő más memóriacímen van, "Áprád" értékű String obj.-ra elveszti a ref.-át

        System.out.println(s1);

        String s2 = s1.toUpperCase(); // s1 által letárolt mem. címen lévő String obj. értéke "Bence"
        // "Bence" értékre obj.-ra ráhívsz egy .toUpperCase() metódust (String class taggfüvény)
        // "Bence" -> "BENCE" new String(). -> "BENCE" értékű String obj. egy totál más mem. területen van

        String s3 = s2.toLowerCase();
         */

        /*
        String s1 = "Árpád"; // new String("Árpád") -> 122-es memóriterület

        System.out.println(s1);

        String s2 = s1.toUpperCase();

        System.out.println(s2);
        System.out.println(s1);

        System.out.println(s1.hashCode());
        System.out.println(s1.toLowerCase().hashCode());
        System.out.println(s2.hashCode());
         */

        /*
        Dog d1 = new Dog();
        System.out.println(d1.getName() + " " + d1.getAge());

        Dog d2 = new Dog();
        System.out.println(d2.getName() + " " + d2.getAge());
         */

        Dog d = new Dog(); // new Dog -> 122
        d = new Dog(); // new Dog -> 123


        /*
        final Dog d1 = new Dog();
        d1 = new Dog();*/
        // d1 ref. vált. konstans, nem inicializálhatom újra
    }
}
