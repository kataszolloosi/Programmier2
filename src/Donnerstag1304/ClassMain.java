package Donnerstag1304;

public class ClassMain {
    public static void main(String[] args) {
        Class c = new Class("programmieren2", 35, 15, Wochentag.DONNERSTAG);
        Class c1 = new Class("Math", 15, 15, Wochentag.FREITAG);
        Class c2 = new Class("Modelle", 25, 15, Wochentag.DIENSTAG);
        Class c3 = new Class("Datenbank", 25,15, Wochentag.MONTAG);


        System.out.println(c.getName() + " " + c.maxCapacityReached());
        c.setName("Programmieren2");
        System.out.println(c.getName() + " " + c.maxCapacityReached());
        c.enroll();

        Student s = new Student("Nora", "N");
        Student s1 = new Student("Kata", "Szöllösi");
        Student s2 = new Student("Veronika", "Morin");
        System.out.println(s);
        s.enroll(c);
        s1.enroll(c);
        s.printClasses();
        System.out.println("---------------------------");
        Class[] cs = s.getClasses();
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }
        System.out.println("---------------------------");
        s.printClasses();
        System.out.println(Student.getCounter() + " Studenten da!");
        System.out.println(s1.getCounter2() + " Studenten da!");
        System.out.println(s2.getCounter2() + " Studenten da!");
        System.out.println("-------------");
        System.out.println("from int to string");
        int val = 4;
        String str=String.valueOf(val);
        System.out.println(str);
        System.out.println("-----------");
        System.out.println(s2.getId());
        //id formattieren
        System.out.println(String.format("%03d", s2.getId()));
        System.out.println("--------------");
        s1.printStudyDays();



    }
}
