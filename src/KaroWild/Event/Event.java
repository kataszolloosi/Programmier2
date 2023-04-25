package KaroWild.Event;

public class Event {
    private Eventtype type;
    private String title;
    private String ort;
    private double preis;

    public Event(Eventtype type, String title, String ort, double preis) {
        this.type = type;
        this.title = title;
        this.ort = ort;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", preis=" + preis +
                '}';
    }

    public Eventtype getType() {
        return type;
    }

    public void setType(Eventtype type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
