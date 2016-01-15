package politiquesEmprunt;

import emprunteurs.EmprunteurArgent;
import emprunteurs.EmprunteurBronze;
import emprunteurs.EmprunteurCarteLecture;
import emprunteurs.EmprunteurCarteMusique;
import emprunteurs.EmprunteurOr;
import emprunteurs.EmprunteurStandard;

public class AvantageCarteLecture implements AvantageEmprunteur{

	@Override
	public int emprunter(EmprunteurArgent em) {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	public int emprunter(EmprunteurBronze em) {
		// TODO Auto-generated method stub
		return 13;
	}

	@Override
	public int emprunter(EmprunteurCarteLecture em) {
		// TODO Auto-generated method stub
		return 14;
	}

	@Override
	public int emprunter(EmprunteurCarteMusique em) {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int emprunter(EmprunteurOr em) {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public int emprunter(EmprunteurStandard em) {
		// TODO Auto-generated method stub
		return 17;
	}

}
