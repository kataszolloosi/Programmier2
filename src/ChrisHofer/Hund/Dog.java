package ChrisHofer.Hund;

public class Dog {
    /* Exkurs static - hat nichts mit vererbung zu tun */
    //statisches attribut: gibt nur einmal - egal wie viele Hundeobjekte erstelle ich
    public static String latinName= "Canis lupus familiaris";
    public static void printLatinName() {
        String hansi = "Hansi liebt Hunde";
        System.out.println(hansi);
        System.out.println(latinName);
    }
    /* Exkurs static - hat nichts mit vererbung zu tun */

    //auf private attribute können abgeleitete Klassen nicht zugreifen
    //protected schon
    private String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bellen(String wuff) {
        System.out.println(name+  " bellt: "+wuff);
    }

}
