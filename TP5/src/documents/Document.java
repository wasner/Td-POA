package documents;

import politiquesEmprunt.PolitiqueEmprunt;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by w14007405 on 08/01/16.
 */
public abstract class Document {
    protected Date dateRetour;
    protected String titre;

    public Document() {
        this.dateRetour = null;
    } // documents.Document()

    public Date getDateRetour() {
        return dateRetour;
    } // getDateRetour()

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    } // setDateRetour()

    public abstract void emprunter(PolitiqueEmprunt politique);
}
