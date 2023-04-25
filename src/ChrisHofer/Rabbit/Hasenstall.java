package ChrisHofer.Rabbit;

import java.util.ArrayList;

public class Hasenstall {
    private ArrayList<Hase> hasenstall = new ArrayList<>();

    public void add (Hase h) {
        hasenstall.add(h);
    }

    public void hoppeln() {
        for (Hase h : hasenstall) {
            h.hoppeln();
        }
    }
    public void print(){
        for (Hase h : hasenstall) {
            System.out.println(h);
        }
        System.out.println();
    }
}
