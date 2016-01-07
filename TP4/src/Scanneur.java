/**
 * Created by jérémy on 07/01/2016.
 */
public class Scanneur extends ImprimanteMultifonction {
    @Override
    protected void activer() {
        System.out.println("Le scanneur est activé");
    }
    public Scanneur(Imprimante imprimante){
        super(imprimante);
    }
}