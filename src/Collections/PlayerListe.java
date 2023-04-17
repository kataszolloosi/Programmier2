package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerListe {
    private ArrayList<Player> players = new ArrayList<>();
    Map<String, Integer> player = new HashMap<>();

    public void addOrUpdate(Player p, int points) {
       player.put(String.valueOf(p),points);
        System.out.println(player);
    }

    public ArrayList<Player> getPlayerWithPoints(int points) {
        for (Player p : players) {
            if (points > player.get(points)) {
                return players;
            }
        } return null;
    }
}
