package td5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.Doc;

import documents.CD;
import documents.Document;
import documents.Film;
import documents.Livre;
import emprunteurs.EmprunteurArgent;
import politiquesEmprunt.EmpruntDateFixe;
import politiquesEmprunt.EmpruntDateFixe2;
import politiquesEmprunt.EmpruntSelonTypeDoc;
import politiquesEmprunt.PolitiqueEmprunt;

public class Client {
	public static void main(String[] args) {
		Map<String, Document> mediatheque= new HashMap<String, Document>();
		Livre l1 = new Livre("1984");
		Livre l2 = new Livre("le seigneur des anneaux");
		CD c1 = new CD("Satisfaction");
		CD c2 = new CD("Abbey Road");
		Film f1 = new Film("2001 Odyssee de l'espace");
		Film f2 = new Film("Taxi Driver");
		
		mediatheque.put("LI_ORW_1", l1);
		mediatheque.put("LI_TOL_1", l2);
		mediatheque.put("CD_STO_1", c1);
		mediatheque.put("CD_BEA_1", c2);
		mediatheque.put("FI_KUB_1", f1);
		mediatheque.put("FI_SCO_1", f2);
		
		List<Document> panier = new ArrayList<Document> ();
		panier.add(l1);
		panier.add(f1);
		panier.add(c1);
		
 		
		for (Document d : panier){
			d.setDateRetour(CalculDate.ajout(15));
		}
		
		for (Document d : panier){
			System.out.println(d.toString());
		}
		System.out.println("");
		PolitiqueEmprunt p1 = new EmpruntDateFixe();
		PolitiqueEmprunt p2 = new EmpruntSelonTypeDoc();
		for(Document d :panier){
			d.emprunter(p2);
		}
		for (Document d : panier){
			System.out.println(d.toString());
		}
		System.out.println("");
		for(Document d : panier){
			d.emprunter(p1);
		}
		for (Document d : panier){
			System.out.println(d.toString());
		}
		System.out.println("");
		
		PolitiqueEmprunt p3 = new EmpruntDateFixe2(new EmprunteurArgent());
		for(Document d: panier){
			d.emprunter(p3);
		}
		for (Document d : panier){
			System.out.println(d.toString());
		}
		System.out.println("");
	}
}
