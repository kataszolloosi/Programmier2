package Vererbung2;

public class SpezialisierterArzt extends Arzt {
    private double zuschlag;

    public SpezialisierterArzt(String name, double gehalt, double zuschlag) {
        super(name, gehalt);
        this.zuschlag = zuschlag;
    }

    public double getGehalt() {
        double gehalt = super.getGehalt();
        return gehalt = gehalt * (1 + zuschlag);
    }
}
