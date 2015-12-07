import java.util.Date;

public class GestionEntreprise {
    public static void main(String[] args) {
        Entreprise myEntreprise = new Entreprise("maBoiteInfo");
        CompanySerializer serializer = new CompanySerializer(myEntreprise);
        
        serializer.retriveEmployees();
        
        if(myEntreprise.getNbEmployees() < 1){
            myEntreprise.embaucher(new EmployeOrdinaire(5, "J�r�my", "WASNER", 10, new Date(10, 3, 15), new Date(104, 12, 15), 15, 15 * 8));
            myEntreprise.embaucher(new Vendeur(6, "Olivier", "RICHIT", 7, new Date(95, 10, 11), new Date(110, 4, 5), 9, 300, 15024, .1));
            myEntreprise.embaucher(new Technicien(7, "Ma�l", "SERRA", 1, new Date(94, 4, 21), new Date(105, 1, 1), 5, 1, 0, 100));
            myEntreprise.embaucher(new Representant(8, "Ma�l", "THOMASSEY", 15, new Date(25, 3, 15), new Date(114, 11, 11), 15, 125));
            serializer.saveEmployees();
        }
        
        System.out.println(myEntreprise);
        
        for (Employe employe : myEntreprise.getEmployes()) {
            System.out.println(employe + " salaire : " + employe.salaireNet());
        }
        
        myEntreprise.distribuerBonus(20000);
    }
}