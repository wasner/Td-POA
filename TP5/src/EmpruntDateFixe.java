import java.util.ArrayList;

/**
 * Created by w14007405 on 08/01/16.
 */
public class EmpruntDateFixe implements PolitiqueEmprunt {
    @Override
    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(15));

    }

    @Override
    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(15));

    }

    @Override
    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(15));

    }
}
