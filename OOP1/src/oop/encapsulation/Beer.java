package oop.encapsulation;

public class Beer {
    // Adat (példányszintűek: adattag, példányváltozó, attribútum, mező)
    private String brand;

    // Konstruktor: ő foglal heap-en memóriát, ő konstrukál össze egy objektumot

    public Beer() {
        // Redundáns, mert én csináltam
        // Ilyet amúgyis csinál a fordító ...
        // (Felesleges)
    }

    public Beer(String brand) {
        setBrand(brand);
    }

    // Adaton operáló művelet (példányszintű: metódusok -> eljárás (void), függvény (int, String, Beer, ...))
    public String getBrand() {
        return brand;
    }

    public String getBrandUpperCase() {
        return brand.toUpperCase();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
