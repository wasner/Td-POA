/**
 * Created by jérémy on 07/01/2016.
 */
public class Photocopieur extends ImprimanteMultifonction {
    @Override
    protected void activer() {
        System.out.println("Le photocopieur est activé");
    }
    public Photocopieur(Imprimante imprimante){
        super(imprimante);
    }
}
