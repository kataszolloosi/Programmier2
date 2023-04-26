package ChrisHofer.Rabbit;

public class Hase implements GoesToParty {
    private String name;

    public Hase(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println(name+" schläft");
    }
    public void hoppeln(){
        System.out.println(name+" hopp-hopp");
    }
    public void fressen(){
        System.out.println(name+" hamm-hamm");
    }

    @Override
    public String toString() {
        return "Hase{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name+ " geht zur Party und isst "+cake+" und trinkt "+drink);
    }
}
