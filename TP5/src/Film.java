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
        String str = "Film " + titre +" : ";
        if (dateRetour != null)
            str += " est à rendre le : " + dateRetour;
        else
            str += "n'est pas emprunté.";
        return str;
    }

    @Override
    public void emprunter(PolitiqueEmprunt politique) {
        politique.emprunter(this);
    }
}
