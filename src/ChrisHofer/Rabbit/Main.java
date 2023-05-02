package ChrisHofer.Rabbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hase h1 =new Hase("Tapsi", 5);
        Weihnachtshase w1 = new Weihnachtshase("Hapsi", 2);
        OsterHase o1 = new OsterHase("TapsiHapsi", 6);
        System.out.println("-----Tapsi Hase-----");
        h1.fressen();
        h1.hoppeln();
        System.out.println("-----Hapsi Weihnachtshase-----");
        w1.hoppeln();
        Hase h2 = new Weihnachtshase("Hapsi2",1);
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
        stall.add(h2);
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
        partyHasen.add(new Hase("Bernhard", 3));
        partyHasen.add(new Igel());
        for (GoesToParty p : partyHasen) {
            p.party("tequila", "Karottenkuchen");
        }

        System.out.println();
        List<Hase> hasenList = new ArrayList<>();
        hasenList.add(h1);
        hasenList.add(w1);
        hasenList.add(o1);
        hasenList.add(h2);
        System.out.println("---noch nicht sortiert---");
        System.out.println(hasenList);
        System.out.println("---schon sortiert---");
        Collections.sort(hasenList);
        System.out.println(hasenList);
        System.out.println();
        System.out.println("---hase namen comparator---");
        Collections.sort(hasenList, new HaseNamenComparator());
        System.out.println(hasenList);
    }
}
