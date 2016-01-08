package emprunteurs;

import politiquesEmprunt.AvantageEmprunteur;

/**
 * Created by w14007405 on 08/01/16.
 */
public class EmprunteurStandard implements Emprunteur {
    public int getBonus(AvantageEmprunteur avantageEmprunteur) {
        return avantageEmprunteur.emprunter(this);
    }
}
