public class Client {
	public static void main(String[] args) {
		ArbreBinaire<String> f1 = feuille("test"); //taille
		ArbreBinaire<String> f2 = feuille("2");
		ArbreBinaire<String> f21 = feuille("3");
        ArbreBinaire<String> f22 = feuille("");
		ArbreBinaire<String> i1 = noeudInterne(f1, "+", f21);

		ArbreBinaire<String> f3 = feuille("4");
		ArbreBinaire<String> f4 = feuille("1");
		ArbreBinaire<String> i2 = noeudInterne(f3, "-", f4);

		ArbreBinaire<String> racine = noeudInterne(i1, "*", i2);

		System.out.println("La taille de la racine est : "+racine.size());

		IterateurArbreBinaire<String> it = new IterateurArbreBinaire<>(f1);

		while(it.hasNext()){
			System.out.println(it.next());
		}

        f1.forEach(System.out::println);

        N expression = new NoeudInterne("");
        expression.evaluer();
	}

	static ArbreBinaire<String> feuille(String str){
		return new ArbreBinaire<>(str, null, null);
	}

	static ArbreBinaire<String> noeudInterne(ArbreBinaire<String> a1, String str, ArbreBinaire<String> a2){
		ArbreBinaire<String> noeud = new ArbreBinaire<>(str, a1, a2);
		a1.setPere(noeud);
		a2.setPere(noeud);
		return noeud;
	}
}