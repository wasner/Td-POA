package politiquesEmprunt;

import documents.CD;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;

public interface PolitiqueEmprunt {
	public void emprunter(CD doc);
	public void emprunter(Livre doc);
	public void emprunter(Film doc);
	
}
