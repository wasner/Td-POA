import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Entreprise {
    private String nom;
    final private Collection<Employe> employes = new PriorityQueue<>(10, new Comparator<Employe>() {
        @Override
        public int compare(Employe o1, Employe o2) {
            return o2.calculAnciennete() - o1.calculAnciennete();
        }
    });

    public Entreprise(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void embaucher(Employe employe){
        employes.add(employe);
    }
    
    public void licencier(Employe employe){
        employes.remove(employe);
    }
    
    public int getNbEmployees(){
        return employes.size();
    }
    
    public Collection<Employe> getEmployes(){
        return employes;
    }
    
    public void distribuerBonus(double totalBonus){
        for (Employe employe : employes) {
            int bonus = employe.bonusAnciennete();
            
            if(totalBonus < bonus)
                break;
            
            totalBonus -= bonus;
            System.out.println("bonus pour : " + employe + " bonus = " + bonus);
        }
    }

    @Override
    public String toString() {
        return "Entreprise{" + "nom=" + nom + ", employes=" + employes + '}';
    }
}
