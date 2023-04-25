package KaroWild.Event;

import java.util.ArrayList;

public class EventMain {
    public static void main(String[] args) {

        Event e1 = new Event(Eventtype.KONZERT, "Tomorrowland", "Amsterdam", 12000.30);
        Event e2 = new Event(Eventtype.VORTRAG, "Elternabend", "Graz", 12.50);
        Event e3 = new Event(Eventtype.KONZERT, "Sensation", "Amsterdam", 6500.90);
        Event e4 = new Event(Eventtype.REISE, "Honeymoon", "Koh Samui", 7200);
        EventCalendar ec = new EventCalendar();
        //events to eventcalendar hinzufügen
        ec.add(e1);
        ec.add(e2);
        ec.add(e3);
        ec.add(e4);

        System.out.println("--alle meine events----");
        ec.print();
        System.out.println("---get by title----");
        System.out.println(ec.getByTitle("Tomorrowland"));
        System.out.println("---get by type---");
        ArrayList<Event> bytype = ec.getByType(Eventtype.KONZERT);
        ec.print(bytype);
        System.out.println("---get by ort---");
        ArrayList<Event> byort = ec.getByOrt("Graz");
        ec.print(byort);
        System.out.println("---die teuerste event---");
        System.out.println(ec.getMostExpensive());
        System.out.println("---remove expensive---"); //nem mutatja, ami 7000 felett van
        ec.removeExpensive3(7000);
        ec.print();
    }
}
