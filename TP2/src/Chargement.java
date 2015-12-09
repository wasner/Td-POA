import java.util.*;

/**
 * Created by w14007405 on 09/12/15.
 */
public class Chargement {
    public Chargement(TreeSet<Conteneur> treeSet) {
        this.conteneurs = new ArrayDeque<>();
        this.conteneurs.addAll(treeSet);

    }

    private Deque<Conteneur> conteneurs;
    public void embarquer(Conteneur conteneur) {
        System.out.println("Embarquer : " + conteneur);
        conteneurs.push(conteneur);
    }
    public Conteneur debarquer () {
        Conteneur conteneur = conteneurs.pop(); //pop() => Supprime un conteneur
        if (conteneur != null) {
            System.out.println("Debarquer : " + conteneur);
        }
        return conteneur;
    }
    public void afficheEmbarquement(){
        System.out.println("Liste des conteneurs Embarquer : ");
        for(Conteneur e:conteneurs )
            System.out.println(e);
    }

}
