package bibliotheek.domain.artikelen;

import bibliotheek.domain.Artikelen;
import bibliotheek.domain.Klant;

public class Boek implements Artikelen {
    private final String titel;
    private final String auteur;
    private final int publicatieJaar;
    private boolean isUitgeleend;

    public Boek(String titel, String auteur, int publicatieJaar) {
        this.titel = titel;
        this.auteur = auteur;
        this.publicatieJaar = publicatieJaar;
    }

    @Override
    public void uitlenen(Klant klant) {
        if (!isUitgeleend){
            klant.artikelToevoegen(this);
            this.isUitgeleend = true;
        }
    }

    @Override
    public void inleveren(Klant klant) {
        if (isUitgeleend) {
            klant.artikelVerwijderen(this);
            this.isUitgeleend = false;
        }
    }

    @Override
    public boolean isUitgeleend() {
        return isUitgeleend;
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
