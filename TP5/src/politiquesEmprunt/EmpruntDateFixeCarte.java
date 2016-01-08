package politiquesEmprunt;

import TD5.CalculDate;
import documents.CD;
import documents.Film;
import documents.Livre;
import emprunteurs.Emprunteur;

/**
 * Created by w14007405 on 08/01/16.
 */
public class EmpruntDateFixeCarte {
    private Emprunteur emprunteur;

    public EmpruntDateFixeCarte(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }


    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(emprunteur.getBonus(new AvantageStatut()) + 12));
    }


    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(emprunteur.getBonus(new AvantageStatut()) + emprunteur.getBonus(new AvantageCarteMusique()) + 12));
    }


    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(emprunteur.getBonus(new AvantageStatut()) + emprunteur.getBonus(new AvantageCarteLecture()) + 10));
    }
}
