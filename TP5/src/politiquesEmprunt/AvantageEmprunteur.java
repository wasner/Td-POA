package politiquesEmprunt;

import emprunteurs.*;

/**
 * Created by w14007405 on 08/01/16.
 */
public interface AvantageEmprunteur {
    public int emprunter(EmprunteurArgent emprunteurArgent);
    public int emprunter(EmprunteurBronze emprunteurBronze);
    public int emprunter(EmprunteurCarteLecture emprunteurCarteLecture);
    public int emprunter(EmprunteurCarteMusique emprunteurCarteMusique);
    public int emprunter(EmprunteurOr emprunteurOr);
    public int emprunter(EmprunteurStandard emprunteurStandard);
}
