/**
 * Created by jérémy on 07/01/2016.
 */
public class ConnectableImprimante implements Connectable {
    private Imprimante imprimante;
    public ConnectableImprimante (Imprimante imprimante){
        this.imprimante = imprimante;
    }
    public void imprimer(){
        imprimante.imprimer();
    }
    @Override
    public void demarrer() {
        imprimante.imprimer();
    }
}
