package KaroWild.Student;

public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;
    private Wochentag tag;

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents =0;
    }public Class(String name, int hours, int maxCapacity, Wochentag tag) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.tag = tag;
        enrolledStudents =0;
    }

    public Wochentag getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
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
