package KaroWild.Event;

import java.util.ArrayList;
import java.util.Iterator;

public class EventCalendar {
    private ArrayList<Event> events = new ArrayList<>();  //ich muss kein konstruktor machen, wenn es steht hier

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void add(Event e) {
        events.add(e);
    }

    public void print () {
        events.forEach((e) -> System.out.println(e));
        System.out.println();
        //for (Event e:events) { sout(e);
    }

    public void print(ArrayList<Event> events) {
        for (Event e : events) {
            System.out.println(e);
        }
        System.out.println();
    }
    //gibt das event mit titel zurück
    public Event getByTitle(String title) {
        //ich bekomme nur eine mit diese titel
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTitle().equals(title)) {
                return events.get(i);
            }
        } return null;
    }

    //gibt alle events vom Typ type zurück
    public ArrayList<Event> getByType(Eventtype type) {
        ArrayList<Event> result = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getType().equals(type)) {  //event.get(i).getType() == type
                result.add(events.get(i));
            }
        }  return result;
    }
    //gibt alle events vom ort ort zurück
    public ArrayList<Event> getByOrt(String ort) {
        //listen zum befüllen mit events
        ArrayList<Event> result = new ArrayList<>();
        //alle events durchlaufen
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getOrt().equals(ort)) {
                result.add(events.get(i));
            }
        } return result;
    }
    //gibt das teuerste event zurück
    public Event getMostExpensive() {
        double price = events.get(0).getPreis();
        Event result = events.get(0);
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPreis() > price) {
                price = events.get(i).getPreis();
                result = events.get(i);
            }
        } return result;

       /* for (Event e : events) {
            if (e.getPreis() > price) {
                price = e.getPreis();
                result = e;
            }
        } return result;*/   //es ist die gleiche wie mit fori
    }
    public void removeExpensive3 (double limit) {
        //iterator mindig a "sor" elejen all, amig van valami mögötte, addig müködik, több elem törlesenel jo
        Iterator<Event> it = events.iterator();
        while (it.hasNext()) {
            Event event = it.next();
            if (event.getPreis() > limit) {
                it.remove();
            }
        }

        //        Iterator<Event> it = events.iterator();
        //        while (it.hasNext()) {
        //        sout(it.next()); }
        //        sout();
    }

}
