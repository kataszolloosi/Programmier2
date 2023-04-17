package Player;

import java.util.ArrayList;

public class Verwaltung {
    private ArrayList<Team> teams = new ArrayList<>();
    //teams zu array
    public void add (Team t) {
        teams.add(t);
    }
    //alle team im verwaltung
    public void print() {
        for (Team t :teams) {
            System.out.println(t);
            t.print();
        }
        System.out.println();
    }
    //team mit beste points
    public Team getWinnerTeam() {
        int punkte = 0;
        Team winner = null;
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getPointsPerTeam() > punkte) {
                winner=teams.get(i);
                punkte = teams.get(i).getPointsPerTeam();

            }
        } return winner;
    }
    //player mit beste punkte
    public Player getBestPlayer() {
        int points = 0;
        Player best = null;
        for (Team t :teams) {
            for (Player p : t.getPlayers()) {
                if (p.getPoints() > points) {
                    best=p;
                    points = p.getPoints();
                }

            }

        } return best;

    }
    //player mit bstimmte id
    public Player getPlayerById(int id) {
        for (Team t : teams) {
            for (Player p : t.getPlayers()){
                if (p.getId() == id) {
                    return p;
                }

            }
        }return null;
    }

}
