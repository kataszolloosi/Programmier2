package ChrisHofer.Instrumente;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> instrumente = new ArrayList<>();

    public void add(Instrument i) {
        instrumente.add(i);
    }

    public int playAll() {
        int summe = 0;
        for (Instrument i : instrumente) {
            //summe += i.play();
            i.play();
            summe += i.getLautStärke();
        }
        return summe;

    }

}
