package politiquesEmprunt;

import emprunteurs.EmprunteurArgent;
import emprunteurs.EmprunteurBronze;
import emprunteurs.EmprunteurCarteLecture;
import emprunteurs.EmprunteurCarteMusique;
import emprunteurs.EmprunteurOr;
import emprunteurs.EmprunteurStandard;

public interface AvantageEmprunteur {
	public int emprunter(EmprunteurArgent em);
	public int emprunter(EmprunteurBronze em);
	public int emprunter(EmprunteurCarteLecture em);
	public int emprunter(EmprunteurCarteMusique em);
	public int emprunter(EmprunteurOr em);
	public int emprunter(EmprunteurStandard em);
}
