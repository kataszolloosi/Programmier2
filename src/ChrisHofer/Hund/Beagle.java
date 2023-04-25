package ChrisHofer.Hund;

//beagle is a dog
public class Beagle extends Dog {
    public String lovedFood;


    public Beagle(String name, int age, String lovedFood) {
        super(name, age);
        this.lovedFood = lovedFood;
    }

    //neue methoden
    public void eatsLovedFood() {
        System.out.println(getName()+ "(" + age + ") isst " + lovedFood);
    }

    //methoden überschreiben(overriding)
    @Override
    public void bellen(String wuff) {
        System.out.println(getName()+ " bellt und jammert: "+ wuff);
    }
}
