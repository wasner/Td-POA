import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CompanySerializer {
    private Entreprise entreprise;

    public CompanySerializer(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
    
    private String getFileName(){
        return entreprise.getNom() + ".data";
    }
    
    public void retriveEmployees(){
        System.out.println("Retriving employees");
        try(InputStream is = new FileInputStream(getFileName());
                ObjectInputStream ois = new ObjectInputStream(is)){
            
            Object obj;
            while((obj = ois.readObject()) != null){
                entreprise.embaucher((Employe) obj);
            }
        }catch(EOFException oef){
            return;
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void saveEmployees(){
        System.out.println("Saving employees");
        try(OutputStream os = new FileOutputStream(getFileName()); 
                ObjectOutputStream oos = new ObjectOutputStream(os)){
            
            for (Employe employe : entreprise.getEmployes()) {
                oos.writeObject(employe);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
