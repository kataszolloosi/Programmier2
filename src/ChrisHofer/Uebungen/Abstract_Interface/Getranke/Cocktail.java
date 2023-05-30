package ChrisHofer.Uebungen.Abstract_Interface.Getranke;

import java.util.ArrayList;

public class Cocktail extends Getraenk {
    protected ArrayList<Fluessigkeit> fluessigkeits;

    public Cocktail(String name, ArrayList<Fluessigkeit> fluessigkeits) {
        super(name);
        this.fluessigkeits = fluessigkeits;
    }

    @Override
    public boolean brennt() {
        for (Fluessigkeit f : fluessigkeits) {
            if (f.getAlkoholProzent() > 30) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return fluessigkeits.size();
    }

    @Override
    public boolean beinhaltetAlkohol() {
        for (Fluessigkeit f : fluessigkeits) {
            if (f.getAlkoholProzent() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double sum = 0;

        for (Fluessigkeit f : fluessigkeits) {
            sum += f.getMenge();
        }
        return sum;
    }

    public ArrayList<Fluessigkeit> getFluessigkeits() {
        return fluessigkeits;
    }

    public void setFluessigkeits(ArrayList<Fluessigkeit> fluessigkeits) {
        this.fluessigkeits = fluessigkeits;
    }
}
