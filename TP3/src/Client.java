/**
 * Created by w14007405 on 16/12/15.
 */
public class Client {
    public static void main (String[] args) {
        ArbreBinaire<String> filsGauche =     new ArbreBinaire<String>(null,null,"titi");
        ArbreBinaire<String> filsDroit  =     new ArbreBinaire<String>(null, null, "tata");
        ArbreBinaire<String> racine     =     new ArbreBinaire<String>(filsGauche, filsDroit, "toto");
    }
    public ArbreBinaire<T> feuille(T mot){
        return new ArbreBinaire<T>(null,null,null);
    }
}
