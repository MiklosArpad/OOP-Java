package oop.abstraction;

public class Computer {

    public void on() {
        powerUpElectricity();
        showOpeningScreen();
    }

    public void off() {
    }

    private void powerUpElectricity() {
// Implementation detail...

    }

    private void showOpeningScreen() {
// nem érdekel kívülről a műkdése
        // nem unit-test
    }
}
