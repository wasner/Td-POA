import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;


public class GestionExpedition {

	public static void charger() {
		//Exercice 2
		TreeSet<Conteneur> ts = (TreeSet<Conteneur>)
				Lecteur.charger("TP2/Conteneurs.ser");

		System.out.println("Liste des Conteneurs");
		Iterator<Conteneur> it = ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());


		//Exercice 3
		System.out.println("Test fonction embarquer / debarquer");
		Chargement chargement = new Chargement(ts);
		chargement.embarquer(new Conteneur ("Soc1",180,"Saint Maximin La Sainte Baume"));
		chargement.afficheEmbarquement();
		chargement.debarquer();

		//Exercice 4
		System.out.println("Test en fonction du poids");
		PriorityQueue<Conteneur> pq = new PriorityQueue<Conteneur>(ts.size(), new ComparateurPoids());
		pq.addAll(ts);
		System.out.println("Liste des Conteneurs");
		Iterator<Conteneur> itp = pq.iterator();
		while (itp.hasNext())
			System.out.println(itp.next());

		}
		//Chargement ch1 = new Chargement(pq);




	public static void main(String[] args) {
		charger();

	}
}//class