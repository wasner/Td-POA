/**
 * Created by jérémy on 07/01/2016.
 */
public class Fax extends ImprimanteMultifonction {
    public Fax(Imprimante imprimante){
        super(imprimante);
    }
    protected void activer() {
        System.out.println("Le fax est actif ! ");
    }
}
