package ChrisHofer.Uebungen.Vergleichen.Kindergarten;

public class Main {
    public static void main(String[] args) {
        // test both comparators
        Kindergarten garten = new Kindergarten("1 Storch");

        garten.addKind(new Kind("Susi", "Meier", 4));
        garten.addKind(new Kind("Toni", "Adler", 3));
        garten.addKind(new Kind("Andrea", "Meier", 5));

        System.out.println(garten.getKinder());

        garten.sortAlphabetical();
        System.out.println(garten.getKinder());

        garten.sortAge();
        System.out.println(garten.getKinder());
    }
}
