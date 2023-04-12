public class Student {
    private String firstName;
    private String lastName;
    private Class[] classes;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3];
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void enroll(Class c1) {
        //kurs noch frei?
        if (!c1.maxCapacityReached()) {

            for (int i = 0; i < classes.length; i++) {
                if (classes[i] == null) {
                    c1.enroll();
                    classes[i] =c1;
                    System.out.println("Kurs angemeldet");
                    break;
                } else {
                    System.out.println("Keine Anmeldung mehr möglich");
                }
            }
        }
    }
    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }



}
