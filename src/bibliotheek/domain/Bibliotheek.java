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

    public void setPersonen(List<Persoon> personen) {
        this.personen = personen;
    }
}
