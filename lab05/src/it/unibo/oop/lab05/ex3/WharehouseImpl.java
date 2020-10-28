package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class WharehouseImpl implements Warehouse {
	
	private Set<Product> prodSet = new LinkedHashSet<>();
	
	public void addProduct(Product p) {
		this.prodSet.add(p);
	}

	public Set<String> allNames() {
		final Set<String> outSet = new LinkedHashSet<>();
		for (final var iterator : this.prodSet) {
			outSet.add(iterator.getName());
		}
		return outSet;
	}

	public Set<Product> allProducts() {
		final Set<Product> outSet = new LinkedHashSet<>();
		for (final var iterator : this.prodSet) {
			outSet.add(iterator);
		}
		return outSet;
	}

	public boolean containsProduct(Product p) {
		return this.prodSet.contains(p);
	}

	public double getQuantity(String name) {
		for (final var iterator : this.prodSet) {
			if (iterator.getName().equals(name)) {
				return iterator.getQuantity();
			}
		}
		return -1;
	}
}
