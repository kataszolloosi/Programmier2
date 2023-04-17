package Donnerstag1304;

import Donnerstag1304.Player;
import Donnerstag1304.PlayerVerwaltung;
import Donnerstag1304.Team;

public class PlayerMain {
    public static void main(String[] args) {
        Player p1 = new Player("Nora", Team.A,7);
        Player p2 = new Player("Kata", Team.A,5);
        Player p3 = new Player("Veronika", Team.B,7);
        Player p4 = new Player("Myla", Team.B,3);
        Player p5 = new Player("Cheda", Team.B,6);
        Player p6 = new Player("Viki", Team.C,1);
        Player p7 = new Player("Sofia", Team.C,4);

        PlayerVerwaltung pv = new PlayerVerwaltung();
        pv.add(p1);
        pv.add(p2);
        pv.add(p3);
        pv.add(p4);
        pv.add(p5);
        pv.add(p6);
        pv.add(p7);
        System.out.println("---alle meine player---");
        pv.print();
        System.out.println("---ein removed---");
        pv.remove(p5);
        pv.print();
        System.out.println("---player by id---");

    }
}
