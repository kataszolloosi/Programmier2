package ChrisHofer.InsturmenteAbstrakt;

public class Trompete extends Instrument {
    public Trompete(int lautStärke) {
        super(lautStärke);
    }

    @Override
    public int play() {
        System.out.println("Trompete wird blasen.");
        return getLautStärke();
    }


}
