package ChrisHofer.Rabbit;

public class Igel implements GoesToParty{

    @Override
    public void party(String drink, String cake) {
        System.out.println("Igel geht zur Party und ist ganz vorsichtig um Niemanden zu stechen un isst " + cake);
    }
}
