package ChrisHofer.Rabbit;

public class Hase implements GoesToParty, Comparable<Hase> {
    private String name;
    private int alter;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Hase(String name, int alter) {
        this.alter = alter; this.name = name;
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
                "name='" + name + '\'' + " " + alter +
                '}';
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name+ " geht zur Party und isst "+cake+" und trinkt "+drink);
    }

    //alter aufsteigend sortieren
    @Override
    public int compareTo(Hase o) {
        if (this.alter < o.alter) {
            return -1;
        } if (this.alter > o.alter) {
            return 1;
        }
        return 0;
    }
}
