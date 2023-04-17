package Player;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Probe {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Kata");
        names.add("Nora");
        names.add("Myla");
        System.out.println(names);

        Map<String, Integer> phonenr = new HashMap<>();
        phonenr.put("Kata", 123456);
        phonenr.put("Nora", 234569);
        phonenr.put("Myla", 456987);
        System.out.println(phonenr);

        System.out.println(phonenr.entrySet());
        System.out.println(phonenr.keySet());
        System.out.println(phonenr.values());

        System.out.println("-------------");

        for (Map.Entry<String, Integer> e : phonenr.entrySet()) {
            System.out.println(e.getKey()+ " : "+e.getValue());
        }
        System.out.println();
        for (String name : phonenr.keySet()) {
            System.out.println(name+ " : "+ phonenr.get(name));
        }

        phonenr.put("Kata", 252525);
        System.out.println(phonenr);
        System.out.println("------");
        Map<String, Integer> map = new HashMap<>();
        map.put("Sofia", 0);
        map.put("Max", 0);
        System.out.println(map);
        map.put("Max", map.get("Max")+1);
        System.out.println(map);

    }
}
