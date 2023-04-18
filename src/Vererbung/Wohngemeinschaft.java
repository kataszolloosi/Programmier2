package Vererbung;

import java.util.ArrayList;

public class Wohngemeinschaft {
    private ArrayList<Person> personen = new ArrayList<>();
    private Adresse adresse;

    public Wohngemeinschaft(Adresse adresse) {
        this.adresse = adresse;
    }

    public void add( Person p) {
        personen.add(p);
    }

    public ArrayList<Person> getPersonen() {
        return personen;
    }

    public void setPersonen(ArrayList<Person> personen) {
        this.personen = personen;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
