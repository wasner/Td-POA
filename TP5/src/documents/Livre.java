package documents;

import politiquesEmprunt.PolitiqueEmprunt;

public class Livre extends Document {

	public Livre(String titre) {
		super(titre);
		// TODO Auto-generated constructor stub
	}
	public void emprunter(PolitiqueEmprunt poli) {
		poli.emprunter(this);
	}
}
