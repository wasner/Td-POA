/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author q13000412
 */
public class ArbreBinaire<T> implements Collection<T> {

	private ArbreBinaire<T> pere;
	private T value;
	private ArbreBinaire<T> gauche;
	private ArbreBinaire<T> droit;

	public ArbreBinaire(T value, ArbreBinaire<T> gauche, ArbreBinaire<T> droit) {
		this.value = value;
		this.gauche = gauche;
		this.droit = droit;
	}

	public void setPere(ArbreBinaire<T> pere) {
		this.pere = pere;
	}

	public void setGauche(ArbreBinaire<T> gauche) {
		this.gauche = gauche;
	}

	public void setDroit(ArbreBinaire<T> droit) {
		this.droit = droit;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public ArbreBinaire<T> getGauche() {
		return gauche;
	}

	public ArbreBinaire<T> getDroit() {
		return droit;
	}

	public T getValue() {
		return value;
	}

	public ArbreBinaire<T> getPere() {
		return pere;
	}

	@Override
	public Iterator<T> iterator() {
		final ArbreBinaire<T> currentArbre = this;

		return new Iterator<T>() {
			private ArbreBinaire<T> arbre = currentArbre;

			@Override
			public boolean hasNext() {
				return getNext() != null;
			}

			private ArbreBinaire<T> getNext() {
				if (arbre.getDroit() != null) {
					ArbreBinaire<T> a = arbre.getDroit();
					while (a.getGauche() != null) {
						a = a.getGauche();
					}

					return a;
				} else {
					ArbreBinaire<T> a = arbre;

					while (a.getPere() != null && a == a.getPere().getDroit()) {
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

		};
	}

	@Override
	public int size() {
		int g = gauche == null ? 0 : gauche.size();
		int d = droit == null ? 0 : droit.size();
		return g + d + 1;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean add(T e) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}


}