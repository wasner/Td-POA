import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by w14007405 on 06/01/16.
 */
public class ApplicationDomotique {
    static LinkedList<Connectable> liste = new LinkedList<>();
    private static String nomAppareil;

    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Saisir un nom : ");
        FabriqueConnectable fabrique = new FabriqueConnectable();
        while(!(nomAppareil = inStream.readLine()).isEmpty()){
            Connectable c = fabrique.creer(nomAppareil);
            liste.add(c);
            System.out.println("Saisir un nouveau nom : ");

        }
    }
}
