package TD5;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by w14007405 on 08/01/16.
 */
public class CalculDate {
    public static Date ajout(int nbJours){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, nbJours);
        if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            c.add(Calendar.DATE, 1);
        }
        return c.getTime();
    }
}
