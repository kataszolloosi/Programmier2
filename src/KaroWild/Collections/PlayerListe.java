package KaroWild.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerListe {
    Map<Player, Integer> player = new HashMap<>();

    public Map<Player, Integer> getPlayer() {
        return player;
    }



    public void addOrUpdate(Player p, int points) {
        Integer s = player.get(p);
        if (s == null) {
            player.put(p, points);
        } else {
            player.put(p, player.get(p) + points);
        }
    }

    public ArrayList<Player> getPlayerWithPoints(int points) {
        ArrayList<Player> result = new ArrayList<>();
        for (Map.Entry<Player, Integer> entry : player.entrySet()) {
            if (entry.getValue()>points) {
                result.add(entry.getKey());
                //Map<Key, Value> -- Key spieler, Value points(integer)
                //key+value = entryset
            }
        } return result;

        /*for (Player p : player.keySet()) {
            if (player.get(p) > points) {
                result.add(p);
            }
        } return result;   */
    }
}
