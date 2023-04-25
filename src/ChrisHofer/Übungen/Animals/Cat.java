package ChrisHofer.Übungen.Animals;

public class Cat extends Animal {
    protected String name;

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Cat kann klettern");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat kann knurren");
    }
}
