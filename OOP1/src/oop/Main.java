package oop;

public class Main {

    public static void main(String[] args) {
        // Példányosítás: Oszátlyból objektumot hozok létre ...
        // Lépések:
        // 1) megadom a típust: (osztály neve) Beer típus
        // 2) váltózó azonosító: beer1, beer2
        // Változó vagy objketum = típus + azosító
        // beer1 obj. -> Beer típus + beer1 azonosító
        // 3) = new keyd-> memória allokáció (heap)
        // 4) Konsturktor hívás

        // Memória: beer1 (stack), new Beer() (heap)
        Beer beer1 = new Beer("Arany Ászok");
        Beer beer2 = new Beer("Borsodi Bivaly");

        Beer beer3 = new Beer();
        // TODO: validáció ...
        beer3.setBrand("Ezüst Ászok");


        //System.out.println(beer1.hashCode());
        //System.out.println(beer2.hashCode());

        //System.out.println(beer1);
        //System.out.println(beer2);

        //System.out.println(beer1 == beer2);

        // . operátor -> obj. tagjait érem el vele
        //beer1.brand = null; // explicit beállítottuk a beer obj. String adatát null-ra

        // Set:
        /*
        beer1.setBrand("Soproni Ászok");
        beer2.setBrand("Borsodi Bivaly");
         */

        System.out.println(beer1.getBrand());
        System.out.println(beer2.getBrand());
        System.out.println(beer3.getBrand());

        System.out.println(beer3.getBrandUpperCase());


/*
        // Get:
        System.out.println(beer1.brand);
        System.out.println(beer1.brand.toUpperCase()); // futásidejű kivétel -> NullReferenceException
*/

        /*Beer beer3 = null;
        System.out.println(beer3);
        System.out.println(beer3.brand);*/

    }
}
