import java.util.HashMap;
import java.util.Map;

/**
 * Created by w14007405 on 09/12/15.
 */
public class GestionDistance {
    private static Map<String, Integer> distanceVille = new HashMap<>();

    static {
        distanceVille.put("Barcelone", 183);
        distanceVille.put("Valence", 337);
        distanceVille.put("Alicante", 399);
        distanceVille.put("Malaga", 599);
    }
    public static Integer distance (String ville){
        return distanceVille.get(ville);
    }
}
