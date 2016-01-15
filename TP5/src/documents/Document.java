package documents;

import java.util.Date;

import politiquesEmprunt.PolitiqueEmprunt;

public abstract class Document {
	private Date dateRetour=null;
	private String titre;
	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public String getTitre() {
		return titre;
	}
	public Document(String titre) {
		// TODO Auto-generated constructor stub
		this.titre= titre;
	}
	public String toString() {
		String affich;
		affich= titre;
		if(dateRetour==null)
			affich+= " pas emprunter";
		else
			affich+=" date de rendu :" + dateRetour.toString();
		return affich;
	}
	public abstract void emprunter(PolitiqueEmprunt poli);
}
