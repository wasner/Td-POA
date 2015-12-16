/**
 * Created by w14007405 on 16/12/15.
 */
public class ArbreBinaire<T> {
    private ArbreBinaire<T> pere;
    private T element;
    private ArbreBinaire<T> filsGauche;
    private ArbreBinaire<T> filsDroit;


    public ArbreBinaire(ArbreBinaire<T> filsGauche, ArbreBinaire<T> filsDroit, T element) {
        this.filsGauche = filsGauche;
        this.filsDroit = filsDroit;
        this.element = element;
        this.filsGauche.pere = this;
        this.filsDroit.pere = this;
    }


    public ArbreBinaire<T> getFilsGauche() {
        return filsGauche;
    }

    public ArbreBinaire<T> getFilsDroit() {
        return filsDroit;
    }
    public T getElement() {
        return element;
    }


}
