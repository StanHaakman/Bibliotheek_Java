package bibliotheek.domain;

public interface Artikelen {
    void uitlenen(Klant klant);

    void inleveren(Klant klant);

    boolean isUitgeleend();
}
