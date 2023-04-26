package ChrisHofer.Animals;

import ChrisHofer.Animals.Animal;

public class Giraffe extends Animal {

    protected int anzahlFlecken;


    public Giraffe(String name, int anzahlBeine, String augenFarbe) {
        super(name, anzahlBeine, augenFarbe);
        anzahlFlecken = 40;  //typische giraffe
    }

    public Giraffe(String name, int anzahlBeine, String augenFarbe, int anzahlFlecken) {
        super(name, anzahlBeine, augenFarbe);
        this.anzahlFlecken=anzahlFlecken;
    }

    public void praesentiertFlecken() {
        System.out.println("Giraffe " + name+ " hat " + anzahlFlecken+" Flecken");
    }


    @Override
    public void move(int meters) {
        System.out.println("Giraffe "+name+" stolziert "+meters+" meter weit");
    }

    @Override
    public void makeNoise(String withComment) {
        System.out.println("schmatz schmatz: " + withComment);
    }
}
