package it.unibo.oop.lab05.ex1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    

    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	TreeSet<String> t = new TreeSet<>();

    	for(int i=1; i <= 20; i++) {
    		t.add(Integer.toString(i));
    	}
    	
		System.out.println(t.toString());
		
		for(int i=3; i <= 20 ; i+= 3) {
			if (t.contains(Integer.toString(i))) {
				t.remove(Integer.toString(i));
			}
		}
		System.out.printf("My toString after removing some items\n[");
		for (Iterator<String> it = t.iterator(); it.hasNext();) {
			System.out.printf("%s ",it.next());
		}
		System.out.printf("]\n");
		
		System.out.println("Even numbers? " + (t.size() % 2 == 0));
	}
}
