

import java.util.Date;

public class Vendeur extends Employe {
    private double chiffreAffaire;
    private double tauxCommission;

    public Vendeur(int number, String prenom, String nom, int grade, Date anniversaire, Date recrutement, double base, double nbHeures, double chiffreAffaire, double tauxCommission) {
        super(number, prenom, nom, grade, anniversaire, recrutement, base, nbHeures);
        this.chiffreAffaire = chiffreAffaire;
        this.tauxCommission = tauxCommission;
    }

    @Override
    public double salaireBrut() {
        return getBase() + chiffreAffaire * tauxCommission;
    }
}
