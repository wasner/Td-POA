import java.io.Serializable;

public class Conteneur implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String expediteur;
	private int poids;

    private String destination;
	
	public Conteneur(String expediteur,int poids, String destination)
	{
		this.expediteur=expediteur;
		this.poids=poids;
		this.destination=destination;
	}

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

	
	public String toString()
	{
		return "Conteneur expédié par la société "+expediteur+" à destination de "+destination+" de poids "+poids;
	}
	
}
