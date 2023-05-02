package ChrisHofer.Uebungen.Animals;

public class Lion extends Animal {

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }
    public void walk(){
        System.out.println("Lion kann sprungen");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion kann brüllen");
    }

    public void roar() {
        System.out.println("roar-roar");
    }
}
