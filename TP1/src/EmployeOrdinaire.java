import java.util.Date;

public class EmployeOrdinaire extends Employe {

    public EmployeOrdinaire(int number, String prenom, String nom, int grade, Date anniversaire, Date recrutement, double base, double nbHeures) {
        super(number, prenom, nom, grade, anniversaire, recrutement, base, nbHeures);
    }

    @Override
    public double salaireBrut() {
        return super.salaireBrut() + getGrade() + 100;
    }
    
}
