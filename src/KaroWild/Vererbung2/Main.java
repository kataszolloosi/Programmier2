package KaroWild.Vererbung2;

public class Main {
    public static void main(String[] args) {
        Arzt a1 = new Arzt("Dr Phil", 3500);

        SpezialisierterArzt sp1 = new SpezialisierterArzt("Dr Nora", 3400, 0.2);

        Krankenhaus lkh = new Krankenhaus();

        lkh.add(a1);
        lkh.add(sp1);
        lkh.print();

    }
}
