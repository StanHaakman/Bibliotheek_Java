package bibliotheek.domain;

public class Klant extends Persoon{
    private double saldo;
    private final int aansluitJaar;

    public Klant(String naam, int leeftijd, double saldo, int aansluitJaar) {
        super(naam, leeftijd);
        this.saldo = saldo;
        this.aansluitJaar = aansluitJaar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "saldo=" + saldo +
                ", aansluitJaar=" + aansluitJaar +
                '}';
    }
}
