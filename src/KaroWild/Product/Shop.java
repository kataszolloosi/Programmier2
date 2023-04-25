package KaroWild.Product;

import java.util.*;

public class Shop {
    private Map<String, Produkt> produkte = new HashMap<>();

    public Map<String, Produkt> getProdukte() {
        return produkte;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "produktMap=" + produkte +
                '}';
    }

    //zum enfugen eines produktes
    public void add(Produkt p) {
        //brauche ich key und value
        produkte.put(p.getTitle(), p);
    }

    //gesuchte produkt zuruckgeben
    public Produkt get(String title) {
        Produkt p = produkte.get(title);
        if (p == null) {
            System.out.println("nicht gefunden");
        }
        return p;
    }

    //gibt produkte teurer als from
    public ArrayList<Produkt> getByPriceFrom(double from) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Map.Entry<String, Produkt> entry : produkte.entrySet()) {
            Produkt p = entry.getValue();
            if (p.getPrice() > from) {
                result.add(p);
            }
        }
        return result;

//        for (String key : produkte.keySet()) {
//            Produkt p = produkte.get(key);
//            if (p.getPrice() > from) {
//                result.add(p);
//            }
//        }  return result;

    }

    //produkte gunstiger als to
    public ArrayList<Produkt> getByPriceTo(double to) {
        ArrayList<Produkt> result = new ArrayList<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() < to) {
                result.add(p);
            }
        }
        return result;
    }

    //entfernt produkte teuerer als from mit iterator
    public void removeProductsFromByIterator(double from) {
        //Iterator<Map.Entry<String, Produkt> pr = produkte.entrySet().iterator();
        Iterator<Produkt> pr = produkte.values().iterator();
        while (pr.hasNext()) {
            //Map.Entry<String, Produkt> e = pr.next();
            Produkt produkt = pr.next();
            if (produkt.getPrice() > from) {
                pr.remove();
            }
        }
    }

    //entferns produkte teurer als from mit keyset
    public void removeProductsFromByKeySet(double from) {
        Set<String> keys = new HashSet<>();
        for (Produkt p : produkte.values()) {
            if (p.getPrice() > from) {
                keys.add(p.getTitle());
            }
        } produkte.keySet().removeAll(keys);
    }


}
