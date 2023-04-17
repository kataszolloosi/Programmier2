package Player;

public class Player {
    //attribute
    private int id;
    private String name;
    private int points;
    private static int counter= 1;
    private Team team;
    //konstruktor
    public Player(String name, int points) {
        this.name = name;
        this.points =points;
        this.id=counter++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                " name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Player.counter = counter;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
