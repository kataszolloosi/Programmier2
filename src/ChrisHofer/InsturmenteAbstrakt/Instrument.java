package ChrisHofer.InsturmenteAbstrakt;

public abstract class Instrument {
    private int lautStärke;

    public Instrument(int lautStärke) {
        this.lautStärke = lautStärke;
    }

    public int getLautStärke() {
        return lautStärke;
    }

    public void setLautStärke(int lautStärke) {
        this.lautStärke = lautStärke;
    }

    public abstract int play();
}
