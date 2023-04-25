package ChrisHofer.Übungen.Konto;

public class SparKonto extends Konto{
    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void einzahlen(double wert) {

    }

    @Override
    public double auszahlen(double wert) {
        return wert;
    }
}
