package oop;

public class ImmutableGyakorlas {
    public static void futtatas() {
        // Immutable -> megváltoztathatatlan az állapota ...
        // legismertebb immutable class: String

        String s1 = new String("Árpád");
        s1 = "Bence"; // = new String("Bence);

        System.out.println(s1);

        String s2 = s1.toUpperCase();

        String s3 = s2.toLowerCase();

        System.out.println(s3);
    }
}
