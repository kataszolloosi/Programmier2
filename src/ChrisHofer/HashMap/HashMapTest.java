package ChrisHofer.HashMap;

import ChrisHofer.Rabbit.Hase;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        //wir möchten allle hasen mit einer steuernummer speichern um sie schnell zu finden um korrekt versteuern zu können
        HashMap<String, Hase> steuerHase = new HashMap<>();

        Hase h1 = new Hase("Hansi");
        Hase h2 = new Hase("Susi");
        //.put: etwas in hashmap geben
        steuerHase.put("123H", h1);
        steuerHase.put("234H", h2);
        //wert auslesen durch angabe des schlüssels
        System.out.println(steuerHase.get("123H"));
        //wenn schlüssel nicht vorhanden ist, kommt null zurueck
        System.out.println(steuerHase.get("bloedsinn"));
        //fragen ob ein key in hashmap inst
        System.out.println(steuerHase.containsKey("123H"));
        //nur notfalls machen - ist langsam
        System.out.println(steuerHase.containsValue(h1));
        //hase h2 statt hase h1 ueber 123H abrufbar
        //System.out.println(steuerHase.put("123H", h2));

        //ueber hashmap iterieren
        System.out.println("----------");
        for (Map.Entry<String, Hase> hase : steuerHase.entrySet()) {
            System.out.println(hase.getKey());
            //hase.getValue().hoppeln();
            Hase h = hase.getValue();
            h.hoppeln();
        }

        System.out.println("------------");
        //andere variante - iterieren ueber alle schluesselelemente
        for (String key : steuerHase.keySet()) {
            steuerHase.get(key);
            Hase h = steuerHase.get(key);
            h.hoppeln();
        }

        //steuerHase.getOrDefault();


    }

}
