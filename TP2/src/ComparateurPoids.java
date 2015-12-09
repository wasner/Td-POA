import java.util.Comparator;

/**
 * Created by w14007405 on 09/12/15.
 */
public class ComparateurPoids implements Comparator<Conteneur> {
    @Override
    public int compare(Conteneur c1, Conteneur c2) {
        return c1.getPoids() - c2.getPoids();
    }
}
