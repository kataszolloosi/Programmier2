package ChrisHofer.Uebungen.Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        kontostand =0;    }
    public double einzahlen(double wert) {
        return kontostand+=wert;
    }
    public double auszahlen(double wert) {

        return kontostand-=wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }
}
