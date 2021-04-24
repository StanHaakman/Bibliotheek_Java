package bibliotheek;

import bibliotheek.domain.Bibliotheek;
import bibliotheek.domain.Klant;
import bibliotheek.domain.artikelen.Boek;
import bibliotheek.domain.artikelen.DVD;


public class Main {

    public static void main(String[] args) {
        Bibliotheek medemblik = new Bibliotheek(
                "Bibliotheek Medemblik"
        );

        System.out.println(medemblik);

        Boek philosophersStone = new Boek(
                "Harry Potter: Philosopher's Stone",
                "J.K. Rowling",
                1997
        );
        Boek philosophersStone2 = new Boek(
                "Harry Potter: Philosopher's Stone",
                "J.K. Rowling",
                1997
        );
        Boek chamberOfSecrets = new Boek(
                "Harry Potter: Chamber of Secrets",
                "J.K. Rowling",
                1998
        );

        DVD percyJackson = new DVD(
                "Percy Jackson & the Olympians: The Lightning Thief",
                "Chris Columbus",
                2010
        );

        Klant p1 = new Klant(
                "Stan Haakman",
                20,
                200,
                2018
        );

        Klant p2 = new Klant(
                "Michelle Koch",
                21,
                100,
                2015
        );

        Klant p3 = new Klant(
                "Nick Andringa",
                21,
                10,
                2021
        );

        // 2 Personen toevoegen aan de bibliotheek
        medemblik.toevoegenAanPersonen(p1);
        medemblik.toevoegenAanPersonen(p2);
        medemblik.toevoegenAanPersonen(p2);
        medemblik.toevoegenAanPersonen(p3);

        // 4 Artikelen toevoegen aan bibliotheek
        medemblik.toevoegenAanArtikelen(philosophersStone);
        medemblik.toevoegenAanArtikelen(philosophersStone);
        medemblik.toevoegenAanArtikelen(chamberOfSecrets);
        medemblik.toevoegenAanArtikelen(percyJackson);

        // 1 artikel verwijderen uit bibliotheek
        medemblik.verwijderenUitArtikelen(philosophersStone);

        // 1 persoon verwijderen uit bibliotheek
        medemblik.verwijderenUitPersonen(p2);

        System.out.println(medemblik);

        philosophersStone.uitlenen(p1);
        chamberOfSecrets.uitlenen(p1);
        philosophersStone.inleveren(p1);

        philosophersStone2.uitlenen(p2);

        philosophersStone.uitlenen(p3);
        percyJackson.uitlenen(p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
