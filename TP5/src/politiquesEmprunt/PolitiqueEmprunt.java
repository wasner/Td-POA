package politiquesEmprunt;

import documents.CD;
import documents.Film;
import documents.Livre;

/**
 * Created by w14007405 on 08/01/16.
 */
public interface PolitiqueEmprunt {
    void emprunter(Film film);
    void emprunter(CD cd);
    void emprunter(Livre livre);
}
