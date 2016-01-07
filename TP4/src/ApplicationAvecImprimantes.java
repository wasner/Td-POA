import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by jérémy on 07/01/2016.
 */
public class ApplicationAvecImprimantes {
    public static void main(String[] args){
        Collection<Imprimante> imprimante = new ArrayList<>();
        Demarreur demarreur = new Demarreur();

        Imprimante imprimante1 = new ImprimanteLocale();
        imprimante.add(imprimante1);
        Imprimante imprimante2 = new ImprimanteReseau();
        imprimante.add(imprimante2);
        Imprimante imprimante3 = new Photocopieur(new ImprimanteReseau());
        imprimante.add(imprimante3);
        Imprimante imprimante4 = new Scanneur(new ImprimanteLocale());
        imprimante.add(imprimante4);
        Imprimante imprimante5 = new Fax(new ImprimanteLocale());
        imprimante.add(imprimante5);

        for(Imprimante i : imprimante){
            demarreur.attacher(new ConnectableImprimante(i));
        }

        demarreur.demarrer();
    }
}
