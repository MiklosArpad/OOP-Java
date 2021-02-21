package oop.abstraction;

public class DVDPlayer {
    private boolean isOn;

    /*
    public DVDPlayer() {
        this(false); // konstruktor láncolás
    }

    private DVDPlayer(boolean isOn) {
        this.isOn = isOn;
    }
     */


    /**
     * SYSTEM.OUT.PRINTLN <- console UI, POJO-ba vagy Bean-be TILOS !!! Itt csak tesztelési célzattal printelünk,
     * hogy lássuk mizu...
     */
    public void play() {
        if (isOn)
            System.out.println("DVD playing");
        else
            System.out.println("DVD is not playing, please turn on.");
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isArpad(String name) {
        return name.equals("Árpád");
    }

    public void turnOn() {
        if (isOn)
            throw new RuntimeException("nem tudod bekapcsolni, mert már be van kapcsolva");

        isOn = true;
    }

    public void turnOff() {
        if (!isOn)
            throw new RuntimeException("Nem tudod kikapcsolni, mert ki van kapcsolva");

        isOn = false;
        //isOn = false; ÉN ÍGY CSINÁLNÁM
    }
}
// SOC -> seperation of concern -> 1 dolgot egy class, függvény, 1 dolgot tároljon egy változó
// -> SRP -> single responsibility principle -> egy felelősség elve

// JavaBean -> privát adattag, tilos konstruktor (no-args ctor), getter, setter