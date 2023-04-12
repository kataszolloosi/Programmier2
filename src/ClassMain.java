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


    }
}
