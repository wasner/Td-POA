import java.util.ArrayList;

/**
 * Created by w14007405 on 08/01/16.
 */
public class EmpruntSelonTypeDoc implements PolitiqueEmprunt {
    private ArrayList<Document> panier = new ArrayList<>();
    @Override
    public void emprunter(Film film) {
        film.setDateRetour(CalculDate.ajout(5));

    }

    @Override
    public void emprunter(CD cd) {
        cd.setDateRetour(CalculDate.ajout(8));

    }

    @Override
    public void emprunter(Livre livre) {
        livre.setDateRetour(CalculDate.ajout(10));

    }
}
