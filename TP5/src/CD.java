/**
 * Created by w14007405 on 08/01/16.
 */
public class CD extends Document {
    private String titre;

    public CD(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        String str = "CD " + titre +" : ";
        if (dateRetour != null)
            str += "est à rendre le" + dateRetour;
        else
            str += "n'est pas emprunté.";
        return str;
    }

    @Override
    public void emprunter(PolitiqueEmprunt politique) {
        politique.emprunter(this);
    }
}
