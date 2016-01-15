package emprunteurs;

import politiquesEmprunt.AvantageEmprunteur;

public class EmprunteurOr implements Emprunteur  {
	@Override
	public int getBonus(AvantageEmprunteur ae) {
		// TODO Auto-generated method stub
		return ae.emprunter(this);
	}
}
