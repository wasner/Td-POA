package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by w14007405 on 08/01/16.
 */
public class AvantageStatut implements AvantageEmprunteur{
    @Override
    public int emprunter(EmprunteurArgent emprunteurArgent) {
        return 4;
    }

    @Override
    public int emprunter(EmprunteurBronze emprunteurBronze) {
        return 6;
    }

    @Override
    public int emprunter(EmprunteurCarteLecture emprunteurCarteLecture) {
        return 9;
    }

    @Override
    public int emprunter(EmprunteurCarteMusique emprunteurCarteMusique) {
        return 7;
    }

    @Override
    public int emprunter(EmprunteurOr emprunteurOr) {
        return 5;
    }

    @Override
    public int emprunter(EmprunteurStandard emprunteurStandard) {
        return 3;
    }
}
