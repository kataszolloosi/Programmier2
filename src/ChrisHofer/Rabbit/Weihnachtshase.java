package ChrisHofer.Rabbit;

public class Weihnachtshase extends Hase{

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke() {
        System.out.println("Geschenke sind verteilt");
    }


    @Override
    public void party(String drink, String cake) {
        System.out.println("Weihnachtshase "+getName()+ " bringt ganz viele Geschenke zur Party");
    }
}
