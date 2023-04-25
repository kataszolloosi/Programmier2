package KaroWild.Fraction;

public class FractionMain {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1,5);
        System.out.println(fr.doubleToDecimal());
        fr.print();
        Fraction fr1 = new Fraction(1,5);
        Fraction result = fr.multiplicate(fr1);
        result.print();
        Fraction fr2 = new Fraction(1,5);
        fr.multiplicate(fr1,fr2).print();
    }
}
