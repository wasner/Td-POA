package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by w14007405 on 08/01/16.
 */
public class AvantageCarteMusique implements AvantageEmprunteur {
    @Override
    public int emprunter(EmprunteurArgent emprunteurArgent) {
        return 8;
    }

    @Override
    public int emprunter(EmprunteurBronze emprunteurBronze) {
        return 5;
    }

    @Override
    public int emprunter(EmprunteurCarteLecture emprunteurCarteLecture) {
        return 4;
    }

    @Override
    public int emprunter(EmprunteurCarteMusique emprunteurCarteMusique) {
        return 2;
    }

    @Override
    public int emprunter(EmprunteurOr emprunteurOr) {
        return 3;
    }

    @Override
    public int emprunter(EmprunteurStandard emprunteurStandard) {
        return 1;
    }
}
