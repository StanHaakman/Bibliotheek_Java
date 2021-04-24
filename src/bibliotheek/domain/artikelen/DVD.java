package bibliotheek.domain.artikelen;

import bibliotheek.domain.Artikelen;
import bibliotheek.domain.Klant;

public class DVD implements Artikelen {
    private final String titel;
    private final String regisseur;
    private final int releaseJaar;
    private boolean isUitgeleend;

    public DVD(String titel, String regisseur, int releaseJaar) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.releaseJaar = releaseJaar;
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
        return "\nDVD { " +
                "Titel:'" + titel + ",\n" +
                "Regisseur: '" + regisseur + '\'' +
                ", Release jaar: " + releaseJaar +
                ",\nMomenteel uitgeleend? " + (isUitgeleend ? "Ja": "Nee") +
                '}';
    }
}
