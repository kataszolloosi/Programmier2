package Player;

import java.time.temporal.Temporal;

public class PlayerMain {
    public static void main(String[] args) {
       //teams und playsers erstellen
       Team t1 = new Team("Team A");
       Player p1 = new Player("Kata", 7);
       Player p2 = new Player("Nora", 5);
       Player p3 = new Player("Myla", 6);

       Team t2 = new Team("Team B");
       Player p4 = new Player("Cheda", 2);
       Player p5 = new Player("Veronika", 4);

       Team t3 = new Team("Team C");
       Player p6 = new Player("Sofia", 8);
       Player p7 = new Player("Teresa",1);
       //players zu team
       t1.add(p1);
       t1.add(p2);
       t1.add(p3);
       t2.add(p4);
       t2.add(p5);
       t3.add(p6);
       t3.add(p7);
       //teams zu verwaltung
       Verwaltung pv = new Verwaltung();
       pv.add(t1);
       pv.add(t2);
       pv.add(t3);
       //methode aufrufen
       System.out.println("---alle Team-alle Player");
       pv.print();
       System.out.println("---winner team---");
       System.out.println(pv.getWinnerTeam());
       System.out.println("---best player---");
       System.out.println(pv.getBestPlayer());
       System.out.println("---get player by id---");
       System.out.println(pv.getPlayerById(1));
    }
}
