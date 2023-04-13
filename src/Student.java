public class Student {
    private int id;
    private static int counter = 0;
    private int counter2;

    private String firstName;

    private String lastName;
    private Class[] classes;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3];
        this.id = counter++;
        counter2++;
    }

    public int getId() {
        return id;
    }

    public int getCounter2() {
        return counter2;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void enroll(Class c1) {
        if (alreadyEnrolled(c1)) return;

        if (!c1.maxCapacityReached()) {
            if (classes[classes.length - 1] != null) {
                increaseClassArray();
                classes[classes.length - 1] = c1;
            } else {
                for (int i = 0; i < classes.length; i++) {
                    if (classes[i] == null) {
                        c1.enroll();
                        classes[i] = c1;
                        System.out.println("Kurs angemeldet");
                        break;
                    } else {
                        System.out.println("Keine Anmeldung mehr möglich");
                    }
                }
            }

        }
    }

    private void increaseClassArray() {
        Class[] temp = new Class[classes.length + 1];
        for (int i = 0; i < classes.length; i++) {
            temp[i] = classes[i];
        }
        classes = temp;
    }

    private boolean alreadyEnrolled(Class c1) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                if (classes[i].getName().equals(c1.getName())) {
                    System.out.println(c1.getName() + " bereits angemeldet");
                    return true;
                }

            }
        }
        return false;
    }

    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i]);
        }
    }

    public void printStudyDays(){
        System.out.println("Student "+ this.lastName+ " has classes on: ");
        for (int i = 0; i < classes.length; i++) {
            if(classes[i] !=null) {
                System.out.println(classes[i].getTag()+ "("+ classes[i].getName()+")");
            }
        }
    }


}
