package bibliotheek.domain.uitleenables;

import bibliotheek.domain.Artikelen;
import bibliotheek.domain.Klant;

public class Boek implements Artikelen {
    private final String titel;
    private final String auteur;
    private final int publicatieJaar;
    private boolean isUitgeleend = false;

    public Boek(String titel, String auteur, int publicatieJaar) {
        this.titel = titel;
        this.auteur = auteur;
        this.publicatieJaar = publicatieJaar;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getPublicatieJaar() {
        return publicatieJaar;
    }

    @Override
    public void uitlenen(Klant klant) {
        this.isUitgeleend = true;
        klant.artikelToevoegen(this);
    }

    @Override
    public void inleveren(Klant klant) {
        this.isUitgeleend = false;
        klant.artikelVerwijderen(this);
    }

    @Override
    public boolean isUitgeleend() {
        return false;
    }

    @Override
    public String toString() {
        return "\nBoek { " +
                "Titel: " + titel +
                ",\n" +
                "Geschreven door: " + auteur +
                ", Gepubliceerd in: " + publicatieJaar +
                ",\n" +
                "Momenteel uitgeleend? " + (isUitgeleend ? "Ja": "Nee") +
                " }";
    }
}
