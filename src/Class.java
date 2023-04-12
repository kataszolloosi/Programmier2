public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents =0;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }

    public void enroll() {
        if (maxCapacityReached()) {
            System.out.println("kurs ist voll");
        } else {
            System.out.println("Angemeldet");
            enrolledStudents++;
        }
    }

    public boolean maxCapacityReached() {
        return enrolledStudents >= maxCapacity;
    }
}
