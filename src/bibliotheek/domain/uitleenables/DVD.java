package bibliotheek.domain.uitleenables;

import bibliotheek.domain.Artikelen;
import bibliotheek.domain.Klant;

public class DVD implements Artikelen {
    private final String titel;
    private final String regisseur;
    private final int releaseJaar;
    private boolean isUitgeleend = false;

    public DVD(String titel, String regisseur, int releaseJaar) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.releaseJaar = releaseJaar;
    }

    public String getTitel() {
        return titel;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "titel='" + titel + '\'' +
                ", regisseur='" + regisseur + '\'' +
                ", releaseJaar=" + releaseJaar +
                ", isUitgeleend=" + isUitgeleend +
                '}';
    }

    @Override
    public void uitlenen(Klant klant) {

    }

    @Override
    public void inleveren(Klant klant) {

    }

    @Override
    public boolean isUitgeleend() {
        return false;
    }
}
