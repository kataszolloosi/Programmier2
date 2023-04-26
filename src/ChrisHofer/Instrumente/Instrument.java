package ChrisHofer.Instrumente;

public class Instrument {
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
    public int play() {
        System.out.println("Instumente sind cool.");
        return lautStärke;
    }
}
