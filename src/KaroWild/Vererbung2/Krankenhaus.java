package KaroWild.Vererbung2;

import java.util.ArrayList;

public class Krankenhaus {
    private ArrayList<Arzt> ärzte = new ArrayList<>();

    public ArrayList<Arzt> getÄrzte() {
        return ärzte;
    }

    public void setÄrzte(ArrayList<Arzt> ärzte) {
        this.ärzte = ärzte;
    }

    public void add(Arzt arzt) {
        ärzte.add(arzt);
    }

   public void print() {
        ärzte.forEach(arzt -> System.out.println(arzt.getName() + " verdient "+ arzt.getGehalt()));
       System.out.println();
       //for (Arzt a:ärzte) { sout(a); }
   }
}
