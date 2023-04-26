package ChrisHofer.InsturmenteAbstrakt;

public class Gitarre extends Instrument {
    public Gitarre(int lautStärke) {
        super(lautStärke);
    }

    @Override
    public int play() {
        System.out.println("Die Gitarre wird geklimpert.");  //pengetni
        return getLautStärke();
    }

}
