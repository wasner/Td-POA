import java.util.Iterator;
import java.util.TreeSet;


public class GestionExpedition {
	
	public static void charger() {
		TreeSet<Conteneur> ts=(TreeSet<Conteneur>)
				Lecteur.charger("TP2/Conteneurs.ser");
		
		System.out.println("Liste des Conteneurs");
		Iterator<Conteneur> it=ts.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
	
	public static void main(String[] args) {
		charger();

	}

}
