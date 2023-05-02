package ChrisHofer.Rabbit;

public class OsterHase extends Hase{

    public OsterHase(String name, int alter) {
        super(name, alter);
    }

    public void versteckeOstereier() {
        System.out.println("Ostereier sind versteckt");
    }

    @Override
    public void hoppeln() {
        System.out.println(getName()+" hipi-hipp-hopp");
    }
}
