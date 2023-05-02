package ChrisHofer.Uebungen.Animals;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal a){
        for (Animal animal : animals) {
            animals.add(a);
        }
    }

    public int countColor(String color) {
        int counter =0;
        for (Animal a : animals) {
            if (a.color.equals(color)) {
                counter++;
            }
        }

     return counter;
    }

}
