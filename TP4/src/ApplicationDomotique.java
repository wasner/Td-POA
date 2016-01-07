import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by w14007405 on 06/01/16.
 */
public class ApplicationDomotique {
    static LinkedList<Connectable> liste = new LinkedList<>();
    final static private Collection<Connectable> collObjets = new ArrayList<>();
    final static private Demarreur demarreur = new Demarreur();
    private static String nomAppareil;

    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Saisir un nom : ");
        FabriqueConnectable fabrique = new FabriqueConnectable();
        /*while(!(nomAppareil = inStream.readLine()).isEmpty()){
            Connectable c = fabrique.creer(nomAppareil);
            liste.add(c);
            System.out.println("Saisir un nouveau nom : ");*/
        for(String nomObj = inStream.readLine(); !nomObj.isEmpty(); nomObj = inStream.readLine()){
            Connectable objetConnectable = fabrique.creer(nomObj);
            if(objetConnectable != null)
                collObjets.add(objetConnectable);
        }
        demarrerObjet();
        demanderDetacher();
        demarreur.demarrer();


  }

        static public void demarrerObjet() throws IOException{
            BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
            for (Connectable connectable : collObjets) {
                System.out.println("Démarrer " + connectable + " ? (oui/non) ");

                if(inStream.readLine().startsWith("o"))
                    demarreur.attacher(connectable);
            }
        }

    static public void demanderDetacher() throws IOException {
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        for (Connectable connectable : demarreur.recupererAttacher()) {
            System.out.println("Voulez-vous détacher " + connectable + " ? (oui/non)");
            if(inStream.readLine().startsWith("o"))
                demarreur.detacher(connectable);
        }
    }
}
