package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------WordCounter--------------------");
        String str = "Hello Welt";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String str2 = "Hallo Welt der die, das Hallo - 1 : Hallo";
        WordCounter wordCount = new WordCounter(str2);
        wordCount.convertTextToMap();
        System.out.println(wordCount.getWordCount());

        System.out.println("-------------------Player------------------------");
        PlayerListe playerListe = new PlayerListe();
        Player p1 = new Player("Kata");
        Player p2 = new Player("Nora");
        Player p3 = new Player("Myla");
        Player p4 = new Player("Cheda");
        playerListe.addOrUpdate(p1, 80);
        playerListe.addOrUpdate(p2, 100);
        playerListe.addOrUpdate(p3, 120);
        playerListe.addOrUpdate(p4, 90);
        System.out.println("---------update----------");
        System.out.println(playerListe.getPlayer());
        playerListe.addOrUpdate(p1, 80);
        playerListe.addOrUpdate(p2, 10);
        System.out.println(playerListe.getPlayer());
        System.out.println("---------get player with points-----------");
        //wer hat mehrere punkte wie 150
        System.out.println(playerListe.getPlayerWithPoints(100));




    }

}
