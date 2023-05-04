package ChrisHofer.Uebungen.Konto;

public class JugendGiroKonto extends GiroKonto{
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
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

