package ChrisHofer.Uebungen.Animals;

public class Dog extends Animal {
    protected String name;

    public Dog(String color, int countEyes) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Dog kann laufen");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog kann bellen");
    }
}
