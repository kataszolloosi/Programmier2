package ChrisHofer.Uebungen.Konto;

public class SparKonto extends Konto {
    public SparKonto(String inhaber) {
        super(inhaber);
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
