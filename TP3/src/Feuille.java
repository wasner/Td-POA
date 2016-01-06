/**
 * Created by w14007405 on 06/01/16.
 */
public class Feuille extends N {
    private String contenu;

    public Feuille(String contenu) {
        this.contenu = contenu;
    }

    public double evaluer(){return Double.parseDouble(contenu);}
}
