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

    public String getNaam() {
        return naam;
    }

    public void toevoegenAanArtikelen(Artikelen artikel) {

    }

//    Mogelijke uitbreiding
    public void verwijderenUitArtikelen(Artikelen artikel) {

    }

    public void toevoegenAanPersonen(Persoon persoon) {

    }

    //    Mogelijke uitbreiding
    public void verwijderenUitPersonen(Persoon persoon) {

    }

    @Override
    public String toString() {
        return "Bibliotheek{" +
                "naam='" + naam + '\'' +
                ", artikelen=" + artikelen +
                ", personen=" + personen +
                '}';
    }
}
