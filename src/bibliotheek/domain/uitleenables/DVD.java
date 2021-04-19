package bibliotheek.domain.uitleenables;

import bibliotheek.domain.Artikelen;

public class DVD implements Artikelen {
    private final String titel;
    private final String regisseur;
    private final int releaseJaar;
    private boolean isUitgeleend;

    public DVD(String titel, String regisseur, int releaseJaar, boolean isUitgeleend) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.releaseJaar = releaseJaar;
        this.isUitgeleend = isUitgeleend;
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
    public void uitlenen() {

    }

    @Override
    public void inleveren() {

    }

    @Override
    public boolean isUitgeleend() {
        return false;
    }
}
