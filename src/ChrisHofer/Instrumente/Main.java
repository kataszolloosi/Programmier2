package ChrisHofer.Instrumente;

public class Main {
    public static void main(String[] args) {
        Gitarre g1 = new Gitarre(7);
        Trompete t1 = new Trompete(5);
        Piano p1 = new Piano(3);

        System.out.println("---Meine Instumente---");
        g1.play();
        t1.play();
        p1.play();

        Orchester orchester = new Orchester();
        orchester.add(g1);
        orchester.add(t1);
        orchester.add(p1);
        System.out.println("---PlayAll---");
        System.out.println(orchester.playAll());
    }
}
