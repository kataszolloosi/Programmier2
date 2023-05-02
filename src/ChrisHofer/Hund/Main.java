package ChrisHofer.Hund;

import ChrisHofer.Hund.Beagle;
import ChrisHofer.Hund.Dog;

public class Main {
    public static void main(String[] args) {
        //statische attribute können ohne objekt verwendet werden
        System.out.println(Dog.latinName);
        //statische methode kann ohne objekt aufgerufen werden
        Dog.printLatinName();
        System.out.println();
        System.out.println("--------------Beagle--------------");
        Beagle snoopy = new Beagle("Snoopy",30, "Lasagne");
        snoopy.eatsLovedFood();
        snoopy.bellen("vauuuuu");
        System.out.println();
        System.out.println("---------------Dog----------------");
        Dog d1 = new Dog("Baxter", 7);
        d1.bellen("wuff-wuff");
        System.out.println();
        System.out.println("-----Upcasting-Downcastint--------");
        Beagle freddie = new Beagle("Freddie",5,"Gulasch");
        //upcasting - objekt einer kindklasse wird auf referenz der basisklasse gespeichert
        Dog doggo = freddie;
        //bellt wie ein beagle, da eine beagle instanz auf der dog referenz ist
        doggo.bellen("wuff");
        //downcasting - referenz einer basisklasse auf kindklasse casten
        Dog doggo2 = new Beagle("Hubert", 3, "Spaghetti");
        //wir möchten sein lieblingsessen wissen
        Beagle b1 = (Beagle) doggo2;
        b1.eatsLovedFood();

        //instaceof Operator: überprüfen os instanz der klasse eintspricht
        System.out.println("--------instanceof-------");
        if (doggo2 instanceof Dog) {
            System.out.println("yaay ist ein Hund");
        }
        //überprüfen on instanz genau einer konkreten klasse entspricht
        System.out.println("-----------getClass---------");

        if (doggo2.getClass().equals(Beagle.class)) {
            System.out.println("yaay auf doggo2 ist wirklich ein beagle");
        }

        if (doggo2.getClass().equals(Dog.class)) {
            System.out.println("Hier sollten wir nicht reinkommen");
        } else {
            System.out.println("beagle ist kein hund - sondern ein beagle");
        }


    }
}