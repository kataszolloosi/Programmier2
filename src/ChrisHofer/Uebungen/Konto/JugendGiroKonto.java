package ChrisHofer.Uebungen.Konto;

public class JugendGiroKonto extends GiroKonto{
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {

    }

    @Override
    public double auszahlen(double wert) {
        return wert;
    }
}

