package ChrisHofer.Uebungen.Vergleichen.Kindergarten;

import java.util.ArrayList;
import java.util.Collections;

public class Kindergarten {
    private String klasse;
    private ArrayList<Kind> kinder;

    public Kindergarten(String klasser) {
        this.klasse = klasse;
        kinder = new ArrayList<>();
    }

    public void addKind(Kind k) {
        kinder.add(k);
    }

    public void sortAlphabetical() {
        Collections.sort(kinder, new AlphabeticalComparator());
    }

    public void sortAge() {
        Collections.sort(kinder, new AgeComparator());

    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public ArrayList<Kind> getKinder() {
        return kinder;
    }

    public void setKinder(ArrayList<Kind> kinder) {
        this.kinder = kinder;
    }
}
