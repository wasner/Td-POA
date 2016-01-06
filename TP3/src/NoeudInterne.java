/**
 * Created by w14007405 on 06/01/16.
 */
public class NoeudInterne extends N {
    private N gauche;
    private N droit;
    private String contenu;

    public NoeudInterne(N gauche, N droit, String contenu){
        this.gauche = gauche;
        this.droit = droit;
        this.contenu = contenu;
    }
    public double evaluer(){
        switch (contenu) {
            case "+":
                return gauche.evaluer() + droit.evaluer();
                break;
            case "-":
                return gauche.evaluer() - droit.evaluer();
                break;
            case "*":
                return gauche.evaluer() * droit.evaluer();
                break;
            case "/":
                return gauche.evaluer() / droit.evaluer();
                break;
            default: return Double.parseDouble(null);
                     break;
        }
    }
}