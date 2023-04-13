package Donnerstag1304;

import java.util.ArrayList;

public class PlayerVerwaltung {
    private ArrayList<Player> players = new ArrayList<>();

    public void add(Player p) {
        players.add(p);
    }
    public void remove(Player p) {
        players.remove(p);
    }
    public void print() {
        players.forEach((p)-> System.out.println(p));
        System.out.println();
    }
    public Player getPlayerById(int id) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == id) {
                return players.get(i);
            }
        }return null;
    }
    /*public int getPointsPerTeam(Team team) {
        int summe;

    }*/
    public Player getWinner() {
        int punkte = players.get(0).getPoints();
        Player result = players.get(0);
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getPoints() > punkte) {
                punkte = players.get(i).getPoints();
                result = players.get(i);
            }
        } return result;
    }

}
