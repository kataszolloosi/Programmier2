package ChrisHofer.Uebungen.Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        kontostand =0;    }
    public void einzahlen(double wert) {

    }
    public double auszahlen(double wert) {
        return wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }
}
