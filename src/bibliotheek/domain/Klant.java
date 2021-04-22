package bibliotheek.domain;

import java.util.ArrayList;
import java.util.List;

public class Klant extends Persoon {
    private double saldo;
    private final int aansluitJaar;
    private List<Artikelen> geleend = new ArrayList<>();

    public Klant(String naam, int leeftijd, double saldo, int aansluitJaar) {
        super(naam, leeftijd);
        this.saldo = saldo;
        this.aansluitJaar = aansluitJaar;
    }

    public void artikelToevoegen(Artikelen artikel){
        geleend.add(artikel);
    }

    public void artikelVerwijderen(Artikelen artikel) {
        geleend.remove(artikel);
    }

    @Override
    public String toString() {
        return "\nKlant { " +
                "Naam: " + getNaam() +
                ",\n" +
                "Saldo: " + saldo +
                ", " +
                "Aangesloten in: " + aansluitJaar +
                "\n" +
                "Geleende Artikelen: " + geleend +
                "\n}";
    }
}
