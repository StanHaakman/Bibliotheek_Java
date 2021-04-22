package bibliotheek.domain;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheek {
    private final String naam;
    private List<Artikelen> artikelen = new ArrayList<>();
    private List<Persoon> personen = new ArrayList<>();

    public Bibliotheek(String naam) {
        this.naam = naam;
    }

    public void toevoegenAanArtikelen(Artikelen artikel) {
        artikelen.add(artikel);
    }

    public void verwijderenUitArtikelen(Artikelen artikel) {
        artikelen.remove(artikel);
    }

    public void toevoegenAanPersonen(Persoon persoon) {
        personen.add(persoon);
    }

    public void verwijderenUitPersonen(Persoon persoon) {
        personen.remove(persoon);
    }

    @Override
    public String toString() {
        return "\n" +
                "Bibliotheek {" +
                "\n" +
                "Naam: '" + naam + '\'' +
                "," +
                "\n\n" +
                "Artikelen: " + artikelen +
                "\n\n" +
                "Personen: " + personen +
                "\n" +
                "}";
    }
}
