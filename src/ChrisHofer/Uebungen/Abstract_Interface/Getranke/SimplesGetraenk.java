package ChrisHofer.Uebungen.Abstract_Interface.Getranke;

public class SimplesGetraenk extends Getraenk {
    protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name, Fluessigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    public boolean brennt() {
        if (bestandteil.getAlkoholProzent() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public int getAnzahlZutaten() {
        return 1;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if (bestandteil.getAlkoholProzent() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        return bestandteil.getMenge();
    }

    public Fluessigkeit getBestandteil() {
        return bestandteil;
    }

    public void setBestandteil(Fluessigkeit bestandteil) {
        this.bestandteil = bestandteil;
    }
}
