/**
 * Created by j�r�my on 07/01/2016.
 */
public class Scanneur extends ImprimanteMultifonction {
    @Override
    protected void activer() {
        System.out.println("Le scanneur est activ�");
    }
    public Scanneur(Imprimante imprimante){
        super(imprimante);
    }
}