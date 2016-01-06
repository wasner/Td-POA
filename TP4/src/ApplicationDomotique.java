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
    final static private Collection<Connectable> objets = new ArrayList<>();
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
            Connectable obj = fabrique.creer(nomObj);
            if(obj != null)
                objets.add(obj);
        }

        demarrerObjet();

  }

        static public void demarrerObjet() throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (Connectable objet : objets) {
                System.out.println("Démarrer " + objet + " ? (o/n) ");

                if(reader.readLine().toLowerCase().startsWith("o"))
                    demarreur.attacher(objet);
            }
        }
}
