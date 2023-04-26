package ChrisHofer.Instrumente;

public class Piano extends Instrument{
    public Piano(int lautStärke) {
        super(lautStärke);
    }

    @Override
    public int play() {
        System.out.println("Piano wird gespielt.");
        return getLautStärke();
    }
}
