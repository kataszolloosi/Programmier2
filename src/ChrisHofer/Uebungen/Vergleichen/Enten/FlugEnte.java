package ChrisHofer.Uebungen.Vergleichen.Enten;

public class FlugEnte extends Ente{
    protected int gewichtFedern;
    public FlugEnte(String n, int g, int gF) {
        super(n, g);
        gewichtFedern = gF;
    }
    @Override
    public int getFullWeight() {
        return gewicht + gewichtFedern;
    }
    @Override
    public String makeNoise() {
        return "Quak " + name + " "+ getFullWeight();
    }
    @Override
    public String toString() {
        return makeNoise();
    }

}
