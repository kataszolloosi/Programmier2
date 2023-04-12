public class ClassMain {
    public static void main(String[] args) {
        Class c1 = new Class("mathe",8,10);

        c1.enroll();
        c1.maxCapacityReached();
        c1.enroll();

        c1.maxCapacityReached();

        Student s1 = new Student("Kata", "Szollosi");
        System.out.println(s1);
        s1.enroll(c1);
        s1.printClasses();

        s1.enroll(c1);
        System.out.println();
        Class c2 = new Class("modelle",8,10);
        Class c3 = new Class("prog1",8,10);
        s1.enroll(c2);
        s1.enroll(c3);




    }
}
