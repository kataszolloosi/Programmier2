package KaroWild.Vererbung;

public class Student extends Person {  //extends führt zusammen 2 classe --- vererbung
    private String stuidum;
    private int martikelnummer;


    public Student(String name, int alter, String stuidum, int martikelnummer) {
        super(name, alter);
        this.stuidum = stuidum;
        this.martikelnummer = martikelnummer;
    }


    public int getAlter() {
        return super.getAlter();
    }

    public void hallo() {
        super.hallo();
        System.out.println("Ich bin ein Student!");
    }
}
