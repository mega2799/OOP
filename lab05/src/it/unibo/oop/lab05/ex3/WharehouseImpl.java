package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WharehouseImpl implements Warehouse {
	
	private Set<String> prodSet = new LinkedHashSet<String>(); //se facessi Set<String,Porduct> ???? 
	
	public void addProduct(Product p) {
	}

	
	public Set<String> allNames() {
		
		return null;
	}

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
