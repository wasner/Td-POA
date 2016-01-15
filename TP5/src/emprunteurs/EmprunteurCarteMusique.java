package emprunteurs;

import politiquesEmprunt.AvantageEmprunteur;

public class EmprunteurCarteMusique implements Emprunteur  {
	@Override
	public int getBonus(AvantageEmprunteur ae) {
		// TODO Auto-generated method stub
		return ae.emprunter(this);
	}
}
