package ChrisHofer.Uebungen.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
    private ArrayList<Event> events;

    public EventKalender() {
        events = new ArrayList<>();
    }

    public void add(Event e) {
        events.add(e);
    }
    public Event getByTitle(String title){

    }

    public ArrayList<Event> getByOrt(String ort) {

    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max){

    }

    public Event getMostExpensiveByOrt(String ort) {

    }

    public double getAvgPreisByOrt(String ort){

    }

    public HashMap<String, Integer> getCountEventsByOrt(){

    }

    public HashMap<String, Double> getSumPriceEventsByOrt(){

    }



}
