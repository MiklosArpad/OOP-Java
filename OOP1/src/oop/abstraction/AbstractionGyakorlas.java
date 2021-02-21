package oop.abstraction;

public class AbstractionGyakorlas {
    public static void futtatas() {
        var computer = new Computer();
        computer.on();

        // DateTime struct, TimeStamp struct

        // YODA time kiegészítő -> normálisan
        // Instant, LocalDate, LocalDateTime, Duration

        // player.
        DVDPlayer dvdPlayer = new DVDPlayer();

        System.out.println(dvdPlayer.isOn() ? "DVD is on" : "DVD is not on"); // ternary operator

        dvdPlayer.play();

        // VÍZVÁLASZTÓ ...
        dvdPlayer.turnOn();

        if (dvdPlayer.isOn()) {
            System.out.println("DVD is on");
        } else {
            System.out.println("DVD is not on");
        }

        System.out.println(dvdPlayer.isOn() ? "DVD is on" : "DVD is not on");

        dvdPlayer.play();

        dvdPlayer.turnOff();


        // if-else -> ternary operator-ral helyettesíthető

        String name = "Bence";

        System.out.println(name.equals("Árpád") ? "Árpád van a változóban" : "Nem Árpád van a változót");
    }
}
