package bibliotheek.domain;

public class Persoon {
    private final String naam;
    private final int leeftijd;

    public String getNaam() {
        return naam;
    }

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }
}
