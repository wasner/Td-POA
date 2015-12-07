import java.io.Serializable;
import java.util.Date;

abstract public class Employe implements Serializable{
    private int number;
    private String prenom;
    private String nom;
    private int grade;
    final private Date anniversaire;
    final private Date recrutement;
    private double base;
    private double nbHeures;

    public Employe(int number, String prenom, String nom, int grade, Date anniversaire, Date recrutement, double base, double nbHeures) {
        this.number = number;
        this.prenom = prenom;
        this.nom = nom;
        this.grade = grade;
        this.anniversaire = anniversaire;
        this.recrutement = recrutement;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public int getGrade() {
        return grade;
    }

    public double getBase() {
        return base;
    }
    
    public double salaireBrut(){
        return  base * nbHeures;
    }
    
    public double salaireNet(){
        return salaireBrut() * .8;
    }
    
    public int calculAnciennete(){
        long time = System.currentTimeMillis();
        time -= recrutement.getTime();
        long factor = 1000L * 60 * 60 * 24 * 30; //mouth
        return (int)(time / factor);
    }
    
    public int bonusAnciennete(){
        return calculAnciennete() * 10;
    }

    @Override
    public String toString() {
        return "Employe{" + "number=" + number + ", nom=" + nom + ", prenom=" + prenom + ", grade=" + grade + ", anniversaire=" + anniversaire + ", recrutement=" + recrutement + ", base=" + base + ", nbHeures=" + nbHeures + '}';
    }
}
