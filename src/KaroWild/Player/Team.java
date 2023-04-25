package KaroWild.Player;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players = new ArrayList<>();
    private String name;
    private int punkte;
    //konstruktor
    public Team(String name) {
        this.name = name;

    }
    //player zu array
    public void add(Player p) {
        players.add(p);
    }
    //alle player im team
    public void print() {
        players.forEach((p) -> System.out.println(p));
        System.out.println();
    }
    //punkte summe im team
    public int getPointsPerTeam() {
        int summe = 0;

        for (Player p : players) {
            summe += p.getPoints();
        }
        return summe;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", name='" + name + '\'' +
                " ,points=" + getPointsPerTeam() +
                '}';
    }
}
