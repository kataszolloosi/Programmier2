package ChrisHofer.Übungen.Konto;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen(double wert) {

    }

    @Override
    public double auszahlen(double wert) {
        return wert;
    }
}
