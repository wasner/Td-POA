package td5;

import java.util.Calendar;
import java.util.Date;

public abstract class CalculDate {
	public static Date ajout(int duree) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, duree);
		if (c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
			c.add(Calendar.DATE, 1);
		return c.getTime();
		
	} 

}
