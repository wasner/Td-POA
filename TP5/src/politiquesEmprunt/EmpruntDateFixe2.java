package politiquesEmprunt;

import documents.CD;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;
import td5.CalculDate;

public class EmpruntDateFixe2 implements PolitiqueEmprunt{
	public Emprunteur em;
	public EmpruntDateFixe2(Emprunteur em) {
		// TODO Auto-generated constructor stub
		this.em=em;
	}
	@Override
	public void emprunter(CD doc) {
		// TODO Auto-generated method stub
		AvantageEmprunteur av = new AvantageCarteMusique();
		doc.setDateRetour(CalculDate.ajout(15+ em.getBonus(av)));
	}

	@Override
	public void emprunter(Livre doc) {
		// TODO Auto-generated method stub
		AvantageEmprunteur av = new AvantageCarteLecture();
		doc.setDateRetour(CalculDate.ajout(15+ em.getBonus(av)));
	}

	@Override
	public void emprunter(Film doc) {
		// TODO Auto-generated method stub
		AvantageEmprunteur av = new AvantageStatut();
		doc.setDateRetour(CalculDate.ajout(15+ em.getBonus(av)));
	}

}
