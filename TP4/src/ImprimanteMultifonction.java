/**
 * Created by jérémy on 07/01/2016.
 */
abstract public class ImprimanteMultifonction implements Imprimante {
    private Imprimante imprimante;

    public ImprimanteMultifonction(Imprimante imprimante){
        this.imprimante = imprimante;
    }
    public void imprimer(){
        activer();
        imprimante.imprimer();
    }

    abstract protected void activer();
}
