package ChrisHofer.Animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Animal a = new Animal()   keine instanz erzeugen möglich
        Giraffe georg = new Giraffe("Georg", 4, "braun", 43);
        Papagai pauli = new Papagai("Pauli", 2, "blau");

        georg.praesentiertFlecken();

        //upcasting in abstract geht auch
        Animal g1 = georg;

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(georg);
        zoo.add(pauli);
        for (Animal a : zoo) {
            a.move(100);
        }

    }
}
