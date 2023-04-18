package Vererbung;

public class Main {
    public static void main(String[] args) {
        System.out.println("---student---");
        Student s1 = new Student("Kata", 31, "SW", 12345);
        System.out.println(s1);
        s1.hallo();
        System.out.println();

        System.out.println("---arbeitnehmer---");
        Arbeitnehmer a1 = new Arbeitnehmer("Hugo", 39, "ÖBB");
        System.out.println(a1);
        a1.hallo();
        System.out.println();

        System.out.println("---lektor---");
        Lektor l1 = new Lektor("Daniel", 45, "FH", "Datenbank");
        System.out.println(l1);
        l1.hallo();
        System.out.println();
        System.out.println("---wohngemeinschaft mit alle bewohner---");
        Wohngemeinschaft w1 = new Wohngemeinschaft(new Adresse("Ankerstrasse", 4, "Graz", 8054));
        w1.add(s1);
        w1.add(l1);
        w1.add(a1);
        System.out.println(w1.getPersonen());

    }
}
