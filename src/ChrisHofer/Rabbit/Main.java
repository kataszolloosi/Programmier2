package ChrisHofer.Rabbit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hase h1 =new Hase("Tapsi");
        Weihnachtshase w1 = new Weihnachtshase("Hapsi");
        OsterHase o1 = new OsterHase("TapsiHapsi");
        System.out.println("-----Tapsi Hase-----");
        h1.fressen();
        h1.hoppeln();
        System.out.println("-----Hapsi Weihnachtshase-----");
        w1.hoppeln();
        Hase h2 = new Weihnachtshase("Hapsi2");
        h2.hoppeln();
        System.out.println("-----TapsiHapsi Osterhase-----");
        o1.hoppeln();
//        Hase h3 = new OsterHase("TapsiHapsi2");
//        h3.hoppeln();
        System.out.println("-----Hasenstall-----");
        Hasenstall stall = new Hasenstall();
        stall.add(h1);
        stall.add(w1);
        stall.add(o1);
        stall.print();

        System.out.println("-----alle hasen hoppeln-----");
        stall.hoppeln();
        System.out.println();
        //eine kleine party
        System.out.println("-----Party beginnt-----");
        ArrayList<GoesToParty> partyHasen = new ArrayList<>();
        partyHasen.add(h1);
        partyHasen.add(w1);
        partyHasen.add(o1);
        partyHasen.add(new Hase("Bernhard"));
        partyHasen.add(new Igel());
        for (GoesToParty p : partyHasen) {
            p.party("tequila", "Karottenkuchen");
        }


    }
}
