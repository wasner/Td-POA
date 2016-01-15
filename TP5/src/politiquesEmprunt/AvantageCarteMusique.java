package politiquesEmprunt;

import emprunteurs.EmprunteurArgent;
import emprunteurs.EmprunteurBronze;
import emprunteurs.EmprunteurCarteLecture;
import emprunteurs.EmprunteurCarteMusique;
import emprunteurs.EmprunteurOr;
import emprunteurs.EmprunteurStandard;

public class AvantageCarteMusique implements AvantageEmprunteur{

	@Override
	public int emprunter(EmprunteurArgent em) {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int emprunter(EmprunteurBronze em) {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int emprunter(EmprunteurCarteLecture em) {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public int emprunter(EmprunteurCarteMusique em) {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int emprunter(EmprunteurOr em) {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public int emprunter(EmprunteurStandard em) {
		// TODO Auto-generated method stub
		return 12;
	}

}
