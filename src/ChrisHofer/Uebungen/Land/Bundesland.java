package ChrisHofer.Uebungen.Land;

public class Bundesland extends Land{
    private double bruttoSozialProdukt;

    public Bundesland(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    @Override
    public double getBruttoSozialProdukt() {
        return super.getBruttoSozialProdukt();
    }
}
