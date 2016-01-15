package documents;

import politiquesEmprunt.PolitiqueEmprunt;

public class CD extends Document {

	public CD(String titre) {
		super(titre);
		// TODO Auto-generated constructor stub
	}
	public void emprunter(PolitiqueEmprunt poli) {
		poli.emprunter(this);
	}

}
