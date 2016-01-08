package documents;

import politiquesEmprunt.PolitiqueEmprunt;

/**
 * Created by w14007405 on 08/01/16.
 */
public class Film extends Document {
    private String titre;

    public Film(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        String str = "documents.Film " + titre +" : ";
        if (dateRetour != null)
            str += " est à rendre le : " + dateRetour;
        else
            str += "n'est pas emprunté.";
        return str;
    }


    public void emprunter(PolitiqueEmprunt politique) {
        politique.emprunter(this);
    }
}
