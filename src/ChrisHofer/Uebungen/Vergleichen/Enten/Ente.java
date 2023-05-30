package ChrisHofer.Uebungen.Vergleichen.Enten;

public abstract class Ente implements Comparable<Ente> {
    protected String name;
    protected int gewicht;

    public Ente(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public abstract int getFullWeight();

    public abstract String makeNoise();
    @Override
    public int compareTo(Ente o) {
        return Integer.compare(getFullWeight(), o.getFullWeight());
    }
}
