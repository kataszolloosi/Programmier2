package ChrisHofer;

public class IntTest {
    public static void main(String[] args) {
        //primitiver typ
        int a1 = 12;
        //komplexer referenz typ
        Integer a2 = new Integer(13);
        //gleich wie beim a2 - autoboxing
        Integer a3 = 14;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("------String to Integer------");
        String test = "55";
        System.out.println(test+"5");
        int testAlsZahl = Integer.parseInt(test);
        System.out.println(testAlsZahl+5);
    }
}
