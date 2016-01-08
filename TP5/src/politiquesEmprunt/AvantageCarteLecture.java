package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by w14007405 on 08/01/16.
 */
public class AvantageCarteLecture implements AvantageEmprunteur {
    @Override
    public int emprunter(EmprunteurArgent emprunteurArgent) {
        return 7;
    }

    @Override
    public int emprunter(EmprunteurBronze emprunteurBronze) {
        return 2;
    }

    @Override
    public int emprunter(EmprunteurCarteLecture emprunteurCarteLecture) {
        return 1;
    }

    @Override
    public int emprunter(EmprunteurCarteMusique emprunteurCarteMusique) {
        return 4;
    }

    @Override
    public int emprunter(EmprunteurOr emprunteurOr) {
        return 9;
    }

    @Override
    public int emprunter(EmprunteurStandard emprunteurStandard) {
        return 3;
    }
}
