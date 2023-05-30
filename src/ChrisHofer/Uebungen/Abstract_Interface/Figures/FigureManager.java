package ChrisHofer.Uebungen.Abstract_Interface.Figures;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    ArrayList<Figure> figures;

    public FigureManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure f) {
        figures.add(f);
    }

    public double getMaxPerimeter() {
        double highest = 0;
        double help = -1;
        // allen gesetzten Figuren den größten Umfang einer Figur
        for (Figure f : figures) {

            if (help > f.getPerimeter()) {
                highest = help;
            }
        }
        return highest;
    }

    public double getAverageAreaSize() {
        // den durchschnittlichen Flächeninhalt aller verfügbaren Flächen berechnet
        double summe = 0;
        for (Figure f : figures) {
            summe += f.getArea();
        }
        summe = summe / figures.size();
        return summe;
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        // die Summe der Flächen zurückliefert
        HashMap<String, Double> erg = new HashMap<>();
        erg.put("klein", 0.0);
        erg.put("mittel", 0.0);
        erg.put("gross", 0.0);

        for (Figure f : figures) {
            if (f.getArea() < 1000) {
                erg.put("klein", erg.get("klein") + 1);
            } else {
                if (f.getArea() < 5000) {
                    erg.put("mittel", erg.get("mittel") + 1);
                } else {
                    erg.put("gross", erg.get("gross") + 1);
                }
            }
        }
        return erg;
    }
}
