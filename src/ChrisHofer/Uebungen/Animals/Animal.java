package ChrisHofer.Uebungen.Animals;

public class Animal {
    protected String color;
    protected int countEyes;

    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public void walk() {
        System.out.println("Animals können spazieren");
    }

    public void makeNoise() {
        System.out.println("Animals haben noises");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public void setCountEyes(int countEyes) {
        this.countEyes = countEyes;
    }
}
