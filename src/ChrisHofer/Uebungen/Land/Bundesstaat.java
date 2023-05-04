package ChrisHofer.Uebungen.Land;

import java.util.ArrayList;

public class Bundesstaat extends Land {
    private ArrayList<Land> laender = new ArrayList<>();

    public Bundesstaat(ArrayList<Land> laender) {
        this.laender = laender;
    }

    public void addLand(Land l) {
        laender.add(l);
    }

    @Override
    public double getBruttoSozialProdukt() {
        return super.getBruttoSozialProdukt();
    }
}
