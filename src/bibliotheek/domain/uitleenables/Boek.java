package bibliotheek.domain.uitleenables;

import bibliotheek.domain.Artikelen;

public class Boek implements Artikelen {
    private final String titel;
    private final String auteur;
    private final int publicatieJaar;
    private boolean isUitgeleend;

    public Boek(String titel, String auteur, int publicatieJaar, boolean isUitgeleend) {
        this.titel = titel;
        this.auteur = auteur;
        this.publicatieJaar = publicatieJaar;
        this.isUitgeleend = isUitgeleend;
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
