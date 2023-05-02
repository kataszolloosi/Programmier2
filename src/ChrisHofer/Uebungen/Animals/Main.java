package ChrisHofer.Uebungen.Animals;

public class Main {
    public static void main(String[] args) {
        Frog quaxi = new Frog("quaxi", 2);
        Animal quaxiAsAnimal = quaxi;
        Frog quaxi2 = (Frog) quaxiAsAnimal;

        Nature nature = new Nature();

        nature.add(quaxi);
        nature.add(quaxiAsAnimal);
        nature.add(quaxi2);

        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise();
        quaxi2.makeNoise();

    }
}
