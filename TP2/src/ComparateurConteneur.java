import java.util.Comparator;

/**
 * Created by w14007405 on 09/12/15.
 */
public class ComparateurConteneur implements Comparator<Conteneur>{
    @Override
    public int compare(Conteneur c1, Conteneur c2) {
        return GestionDistance.distance(c1.getDestination()).compareTo(GestionDistance.distance(c2.getDestination()));
    }
}
