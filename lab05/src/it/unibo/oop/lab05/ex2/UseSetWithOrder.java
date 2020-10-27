package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
		 * Write a program which:
		 * 
		 * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define a new
		 * Comparator in a separate class.
		 * 
		 * 2) Inserts in the set a hundred strings containing randomly generated numbers
		 * (use Math.random())
		 * 
		 * 3) Prints the set, which must be ordered
		 */
		TreeSet<String> tree = new TreeSet<>();
		for (int i = 0; i < 5; i++) {
			tree.add(Double.toString(Math.random()));
		}
		System.out.println(tree.toString());
		Comparator<String> comparator = new Comparator<>();
		System.out.printf("Result: %d",comparator.compare("cacca","cacca"));

	}
}
