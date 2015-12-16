import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by w14007405 on 16/12/15.
 */
public class IterateurArbreBinaire<T> implements Iterator<ArbreBinaire<T>> {

    private ArbreBinaire<T> arbre;
    public IterateurArbreBinaire(ArbreBinaire<T> arbre) {
        this.arbre = arbre;
    }


    @Override
    public boolean hasNext() {
        return next() != null;
    }

    private ArbreBinaire<T> getNext(ArbreBinaire<T> arbre){
       if (arbre.getFilsDroit() != null) {
           return getNext(arbre.getFilsDroit());
       }
       if (arbre.getPere() != null){
          if(arbre.getPere().getFilsGauche().equals(this)){
            return arbre.getPere();
          }
           return arbre.getFilsGauche();
       }
        return arbre.getPere();
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer consumer) {

    }
}
