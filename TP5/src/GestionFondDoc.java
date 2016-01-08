import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by w14007405 on 08/01/16.
 */
public class GestionFondDoc {
    private static Map<String, Document> mediatheque = new HashMap<>();
    private ArrayList<Document> panier = new ArrayList<>();

    private static void constitution() {
        mediatheque.put("LI_ORW_1", new Livre("1984"));
        mediatheque.put("LI_TOL_1", new Livre("Le seigneur des anneaux"));
        mediatheque.put("CD_STO_1", new CD("Satisfaction"));
        mediatheque.put("CD_BEA_1", new CD("Abbey Road"));
        mediatheque.put("FI_KUB_1", new Film("2001 Odyssée de l'espace"));
        mediatheque.put("FI_SCO_1", new Film("Taxi Driver"));

    }

    public static void main(String[] args) {
        GestionFondDoc.constitution();
        ArrayList<Document> panier = new ArrayList<>();
        panier.add(mediatheque.get("LI_ORW_1"));
        panier.add(mediatheque.get("CD_STO_1"));
        panier.add(mediatheque.get("FI_KUB_1"));

        GestionFondDoc.emprunt(panier);

        for (Map.Entry<String, Document> entry : mediatheque.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }

    private static void emprunt(ArrayList<Document> panier) {
        for (Document doc : panier) {
            doc.setDateRetour(CalculDate.ajout(15));
        }
    }
}