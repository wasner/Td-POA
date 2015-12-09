import java.util.Comparator;

/**
 * Created by w14007405 on 09/12/15.
 */
public class ComparateurConteneur implements Comparator<Conteneur>{
    @Override
    public int compare(Conteneur c1, Conteneur c2) {
        int c = GestionDistance.distance(c1.getDestination()).compareTo(GestionDistance.distance(c2.getDestination()));

        if(c != 0) {
            return c;
        }

        return c1.getPoids() - c2.getPoids();

    }
}
