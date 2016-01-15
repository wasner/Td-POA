package emprunteurs;

import politiquesEmprunt.AvantageEmprunteur;

public class EmprunteurCarteLecture implements Emprunteur  {
	@Override
	public int getBonus(AvantageEmprunteur ae) {
		// TODO Auto-generated method stub
		return ae.emprunter(this);
	}
}
