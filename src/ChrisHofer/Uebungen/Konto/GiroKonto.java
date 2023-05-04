package ChrisHofer.Uebungen.Konto;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public double einzahlen(double wert) {
        return super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        return super.auszahlen(wert);
    }
}
