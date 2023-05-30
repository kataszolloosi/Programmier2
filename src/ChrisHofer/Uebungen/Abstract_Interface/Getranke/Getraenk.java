package ChrisHofer.Uebungen.Abstract_Interface.Getranke;

public abstract class Getraenk  implements Brennbar{
    protected String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + getAnzahlZutaten() + "(" + mengeInMl() + " ml, " + beinhaltetAlkohol() + ", " + brennt() + ")";
    }

    public abstract int getAnzahlZutaten();

    public abstract boolean beinhaltetAlkohol();

    public abstract double mengeInMl();

    public String getName() {
        return name;
    }
}
