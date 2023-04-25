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
        //upcasting
        Dog doggo = freddie;
        //bellt wie ein beagle, da eine beagle instanz auf der dog referenz ist
        doggo.bellen("wuff");
        //downcasting
        Dog doggo2 = new Beagle("Hubert", 3, "Spaghetti");
        //wir möchten sein lieblingsessen wissen
        Beagle b1 = (Beagle) doggo2;
        b1.eatsLovedFood();

    }
}