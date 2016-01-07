import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by w14007405 on 06/01/16.
 */
public class Demarreur {
    final private Collection<Connectable> objets = new ArrayList<>();

    public void attacher(Connectable objet) {
        objets.add(objet);
    }

    public void detacher(Connectable object){
        objets.remove(object);
    }

    public void demarrer(){
        for (Connectable object : objets) {
            object.demarrer();
        }
    }

    public Connectable[] recupererAttacher() {
        return new Connectable[0];
    }
}
