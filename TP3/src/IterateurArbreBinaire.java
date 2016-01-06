import java.util.Iterator;

public class IterateurArbreBinaire<T> implements Iterator<T>{
	private ArbreBinaire<T> arbre;

	public IterateurArbreBinaire(ArbreBinaire<T> arbre) {
		this.arbre = arbre;
	}

	@Override
	public boolean hasNext() {
		return getNext() != null;
	}

	private ArbreBinaire<T> getNext(){
		if(arbre.getDroit() != null){
			ArbreBinaire<T> a = arbre.getDroit();
			while(a.getGauche() != null){
				a = a.getGauche();
			}

			return a;
		}else{
			ArbreBinaire<T> a = arbre;

			while(a.getPere() != null && a == a.getPere().getDroit()){
				a = a.getPere();
			}

			return a.getPere();
		}
	}

	@Override
	public T next() {
		arbre = getNext();
		return arbre.getValue();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}