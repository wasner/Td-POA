

import java.util.Date;

public class Technicien extends EmployeOrdinaire {
    private int nbProd;
    private double tauxCommission;

    public Technicien(int number, String prenom, String nom, int grade, Date anniversaire, Date recrutement, double base, double nbHeures, int nbProd, double tauxCommission) {
        super(number, prenom, nom, grade, anniversaire, recrutement, base, nbHeures);
        this.nbProd = nbProd;
        this.tauxCommission = tauxCommission;
    }
    

    @Override
    public double salaireBrut() {
        return super.salaireBrut() + nbProd * tauxCommission;
    }
    
}
