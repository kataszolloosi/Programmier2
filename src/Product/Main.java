package Product;

public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Brot", 2.99);
        Produkt p2 = new Produkt("Käse", 3.29);
        Produkt p3 = new Produkt("Milch", 1.79);

//        System.out.println(p1);
//        p1.setDiscount(10);
//        p1.setDescription("Aus Lidl");
//        p1.getPriceWithDiscount();
//        System.out.println(p1);
//        System.out.println("---------------------");
//        p2.setDiscount(20);
//        p2.setDescription("Aus Spar");
//        p2.getPriceWithDiscount();
//        System.out.println(p2);


        System.out.println("---------------");
        Shop shop = new Shop();    //map :D
        shop.add(p1);
        shop.add(p2);
        shop.add(p3);
        System.out.println("---alle produkte---");
        System.out.println(shop);
        System.out.println("---gesuchte produkt---");
        System.out.println(shop.get("Brot"));
        System.out.println("---getbypricefrom---");
        System.out.println(shop.getByPriceFrom(2));
        System.out.println("---getbypriceto---");
        System.out.println(shop.getByPriceTo(2.50));
        System.out.println("---enfernt mit iterator---");
        shop.removeProductsFromByIterator(3);
        System.out.println(shop);
        System.out.println("---enfernt mit keyset---");
        shop.removeProductsFromByKeySet(2);
        System.out.println(shop);








    }
}
