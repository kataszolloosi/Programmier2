package ChrisHofer.Sortieren;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Frucht f1 = new Frucht("mango", 350, true);
        Frucht f2 = new Frucht("banane", 150, false);
        Frucht f3 = new Frucht("ananas", 550, true);
        Frucht f4 = new Frucht("apfel", 90, true);

        Frucht [] fruechteArray = {f1,f2,f3,f4};
        System.out.println("---noch nicht sortiert---");
        System.out.println(Arrays.toString(fruechteArray));
        System.out.println("---schon sortiert---");
        Arrays.sort(fruechteArray);
        System.out.println(Arrays.toString(fruechteArray));
        //upcasten
        List<Frucht> fruchtListe = new ArrayList<>();
        fruchtListe.add(f1);
        fruchtListe.add(f2);
        fruchtListe.add(f3);
        fruchtListe.add(f4);
        System.out.println("---noch nicht sortiert---");
        System.out.println(fruchtListe);
        System.out.println("---schon sortiert---");
        Collections.sort(fruchtListe);
        System.out.println(fruchtListe);
    }
}
