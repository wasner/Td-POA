/**
 * Created by j�r�my on 07/01/2016.
 */
public class Photocopieur extends ImprimanteMultifonction {
    @Override
    protected void activer() {
        System.out.println("Le photocopieur est activ�");
    }
    public Photocopieur(Imprimante imprimante){
        super(imprimante);
    }
}
