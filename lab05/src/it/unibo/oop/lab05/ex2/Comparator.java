package it.unibo.oop.lab05.ex2;

public class Comparator implements java.util.Comparator<String> {
	// Compares its two arguments for order. Returns a negative integer, zero, 
	// or a positive integer as the first argument is less than, equal to, or greater than the second.
	public int compare(String arg0, String arg1) {
		if (arg0.equals(arg1)) {
			return 0;
		}
		if (Double.valueOf(arg0) > Double.valueOf(arg1)) {
			return 1;
		}
		return -1;
	}

}
