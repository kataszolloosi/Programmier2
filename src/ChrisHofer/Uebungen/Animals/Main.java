package ChrisHofer.Uebungen.Animals;

public class Main {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green", 2);
        Animal quaxiAsAnimal = quaxi;
        Frog sameQuaxi = (Frog) quaxiAsAnimal;

        quaxi.makeNoise();
        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise();

        Nature nature = new Nature();

        nature.add(quaxi);
        nature.add(quaxiAsAnimal);
        nature.add(sameQuaxi);
        nature.add(new Lion("red", 8));
        nature.add(new Dog("red", 3));
        nature.add(new Cat("green", 5, "Katzi"));


        System.out.println(nature.countColor("green"));
        System.out.println(nature.countColor("red"));



    }
}
