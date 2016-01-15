package documents;

import politiquesEmprunt.PolitiqueEmprunt;

public class Film extends Document{

	public Film(String titre) {
		super(titre);
		// TODO Auto-generated constructor stub
	}
	public void emprunter(PolitiqueEmprunt poli) {
		poli.emprunter(this);
	}
}
