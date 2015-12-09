import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;


public class Lecteur {
	
	public static Collection charger(String file)
	{
        Set<Conteneur> lesConteneurs=new TreeSet<Conteneur>(new ComparateurConteneur());
	    ObjectInputStream ois=null;
		try {
	        FileInputStream fichier = new FileInputStream(file);
	        ois = new ObjectInputStream(fichier);
	        Conteneur c = null;
	        try{
	        	while (true){
	    	        c = (Conteneur) ois.readObject();
	    	        lesConteneurs.add(c);
	        	}
	        }
	        catch(EOFException e) {
		    }
//	        while( ois.available() > 0)
//	        {
//	        	 c = (Conteneur) ois.readObject();
//	        	 System.out.println(c);
//	     	      lesConteneurs.add(c);
//	        }
	    } catch (java.io.IOException e) {
	        e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	      } finally {
	        try {
	          if (ois != null) {
	            ois.close();
	          }
	        } catch (IOException ex) {
	          ex.printStackTrace();
	        }
	      }
		System.out.println("Fin de la restauration");
		return lesConteneurs;
	}
}
