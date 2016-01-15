package politiquesEmprunt;

import emprunteurs.EmprunteurArgent;
import emprunteurs.EmprunteurBronze;
import emprunteurs.EmprunteurCarteLecture;
import emprunteurs.EmprunteurCarteMusique;
import emprunteurs.EmprunteurOr;
import emprunteurs.EmprunteurStandard;

public class AvantageStatut implements AvantageEmprunteur{

	@Override
	public int emprunter(EmprunteurArgent em) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int emprunter(EmprunteurBronze em) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int emprunter(EmprunteurCarteLecture em) {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int emprunter(EmprunteurCarteMusique em) {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int emprunter(EmprunteurOr em) {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int emprunter(EmprunteurStandard em) {
		// TODO Auto-generated method stub
		return 6;
	}

}
