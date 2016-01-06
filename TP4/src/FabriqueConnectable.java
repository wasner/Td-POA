import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by w14007405 on 06/01/16.
 */
public class FabriqueConnectable {

    public Connectable creer(String nomAppareil) {
        Connectable connectable = null;
        switch (nomAppareil){
            case "Radio":
                connectable = new Radio();
                break;
            case "Cafetiere":
                connectable = new Cafetiere();
                break;
            case "Radiateur":
                connectable = new Radiateur();
                break;
        }
        return connectable;
    }
}
