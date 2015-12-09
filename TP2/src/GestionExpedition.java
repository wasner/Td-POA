import java.util.ArrayList;
import java.util.Iterator;


public class GestionExpedition {
	
	public static void charger() {
		ArrayList<Conteneur> ts=(ArrayList<Conteneur>)
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
