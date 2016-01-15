package politiquesEmprunt;

import documents.CD;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;
import td5.CalculDate;

public class EmpruntDateFixe implements PolitiqueEmprunt {
	@Override
	public void emprunter(CD doc) {
		// TODO Auto-generated method stub
		
		doc.setDateRetour(CalculDate.ajout(15));
	}

	@Override
	public void emprunter(Livre doc) {
		// TODO Auto-generated method stub
		doc.setDateRetour(CalculDate.ajout(15));
	}

	@Override
	public void emprunter(Film doc) {
		// TODO Auto-generated method stub
		doc.setDateRetour(CalculDate.ajout(15));
	}

}
