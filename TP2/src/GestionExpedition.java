import java.util.Deque;
import java.util.Iterator;
import java.util.TreeSet;


public class GestionExpedition {

	public static void charger() {
		TreeSet<Conteneur> ts = (TreeSet<Conteneur>)
				Lecteur.charger("TP2/Conteneurs.ser");

		System.out.println("Liste des Conteneurs");
		Iterator<Conteneur> it = ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println("Test fonction embarquer / debarquer");

		Chargement chargement = new Chargement(ts);
		chargement.embarquer(new Conteneur ("Soc1",180,"Saint Maximin La Sainte Baume"));
		chargement.afficheEmbarquement();
		}




	public static void main(String[] args) {
		charger();

	}
}//class