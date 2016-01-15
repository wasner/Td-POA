package emprunteurs;

import politiquesEmprunt.AvantageEmprunteur;

public class EmprunteurStandard implements Emprunteur {
	@Override
	public int getBonus(AvantageEmprunteur ae) {
		// TODO Auto-generated method stub
		return ae.emprunter(this);
	}
}
