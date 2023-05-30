package ChrisHofer.Uebungen.Abstract_Interface.Getranke;

public class Fluessigkeit {
    private String name;
    private double menge;
    private double alkoholProzent;

    public Fluessigkeit(String name, double menge, double alkoholProzent) {
        this.name = name;
        this.menge = menge;
        this.alkoholProzent = alkoholProzent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMenge() {
        return menge;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    public double getAlkoholProzent() {
        return alkoholProzent;
    }

    public void setAlkoholProzent(double alkoholProzent) {
        this.alkoholProzent = alkoholProzent;
    }
}
