package ChrisHofer.Übungen.Animals;

public class Frog extends Animal {
    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Frog kann schwimmen");
    }

    @Override
    public void makeNoise() {
        System.out.println("Frog kann quaken");
    }
}
