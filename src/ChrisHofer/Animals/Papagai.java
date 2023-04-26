package ChrisHofer.Animals;

public class Papagai extends Animal{



    public Papagai(String name, int anzahlBeine, String augenFarbe) {
        super(name, anzahlBeine, augenFarbe);
    }

    @Override
    public void move(int meters) {
        System.out.println("Papagai "+ name+ " fliegt "+ meters+" meter weit");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("Papagai spricht: " +withComment);
    }
}
