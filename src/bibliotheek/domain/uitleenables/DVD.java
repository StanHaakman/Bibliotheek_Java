package bibliotheek.domain.uitleenables;

import bibliotheek.domain.Artikelen;

public class DVD implements Artikelen {
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
