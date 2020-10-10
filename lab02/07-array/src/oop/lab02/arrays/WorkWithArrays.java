package oop.lab02.arrays;

import java.util.Arrays;

public class WorkWithArrays {

    /*
    * ADVICE:
    * If your method implements an algorithm, it doesn't need to contain
    * the whole code! You can decompose your problem into simpler (non-trivial) ones,
    * writing a *private* utility method for each sub problem.
    * Moreover, if your utility method solves a common sub-problem, it may be
    * re-used by other methods within the same class.
    */
	public static void arrayToString(final int[] arr){
		for(int a: arr){
			System.out.println("el: " +  a);
		}
	}

    public static int countOccurrencies(final int[] array, final int elem) {
        int nOccur = 0;
        for (final int currElem : array) {
            if (currElem == elem) {
                nOccur++;
            }
        }
        return nOccur;
    }

	public static int[] evenElements(final int[] array) {
		int[] evenElems = new int[array.length % 2 == 0 ? array.length/2 : array.length/2 + 1];
		for (int i = 0; i < array.length ; i++){ 
			if (i % 2 == 0){
				evenElems[i/2] = array[i];
			}
		}
        return evenElems;
    }

    public static int[] oddElements(final int[] array) {
		int i;
		final int[] oddElems = new int[array.length/2];
		for (i = 1; i < array.length ; i+=2){ 
			oddElems[i/2]= array[i];
		}
        return oddElems;
    }

    public static int mostRecurringElement(final int[] array) {
		final int[] recArray = new int[array.length];
		int i;
		int cnt = 0;
		int maxIndex = 0;
		int index = 0;
		Arrays.sort(array);
		arrayToString(array);
		for (i = 0; i < (array.length - 1); i++) {
			if (array[i] == array[i+1]) {
				recArray[cnt] += 1;
			}else {
				recArray[cnt] += 1;
					if (recArray[cnt] > recArray[maxIndex]){
						maxIndex = cnt;
					}
				cnt++;
			}
		}
		if (array[i] == array[i-1]) {
				recArray[cnt] += 1;
					if (recArray[cnt] > recArray[maxIndex]){
						maxIndex = cnt;
					}
			}
		i = 0;
		while (i != maxIndex) {
			index += recArray[i++];
		}
		return array[index];
    }

    /*
     * Testing methods
     */

    public static boolean testCountOccurrencies() {
        return countOccurrencies(new int[] { 1, 2, 3, 4 }, 1) == 1
                && countOccurrencies(new int[] { 0, 2, 3, 4 }, 1) == 0
                && countOccurrencies(new int[] { 7, 4, 1, 9, 3, 1, 5 }, 2) == 0
                && countOccurrencies(new int[] { 1, 2, 1, 3, 4, 1 }, 1) == 3
                && countOccurrencies(new int[] { 1, 1, 1, 3, 5, 1 }, 1) == 4;
    }

    public static boolean testEvenElements() {
        return Arrays.equals(evenElements(new int[] { 1, 2, 3, 4 }), new int[] { 1, 3 })
                && Arrays.equals(
                        evenElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new int[] { 1, 3, 5, 7, 9 })
                && Arrays.equals(
                        evenElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new int[] { 4, 7, 1, 23, 73 })
                && Arrays.equals(
                        evenElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new int[] { 7, 1, 12, 23, 54 });
    }

    public static boolean testOddElements() {
        return Arrays.equals(oddElements(new int[] { 1, 2, 3, 4 }),
                new int[] { 2, 4 })
                && Arrays.equals(
                        oddElements(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
                        new int[] { 2, 4, 6, 8 })
                && Arrays.equals(
                        oddElements(new int[] { 4, 6, 7, 9, 1, 5, 23, 11, 73 }),
                        new int[] { 6, 9, 5, 11 })
                && Arrays.equals(
                        oddElements(new int[] { 7, 5, 1, 24, 12, 46, 23, 11, 54, 81 }),
                        new int[] { 5, 24, 46, 11, 81 });
    }

    public static boolean testMostRecurringElement() {
        return mostRecurringElement(new int[] { 1, 2, 1, 3, 4 }) == 1
                && mostRecurringElement(new int[] { 7, 1, 5, 7, 7, 9 }) == 7
                && mostRecurringElement(new int[] { 1, 2, 3, 1, 2, 3, 3 }) == 3
                && mostRecurringElement(new int[] { 5, 11, 2, 11, 7, 11 }) == 11;
    }

    public static void main(final String[] args) {
        System.out.println("testCountOccurrencies: " + testCountOccurrencies());
        System.out.println("testEvenElems: " + testEvenElements());
        System.out.println("testOddElems: " + testOddElements());
        System.out.println("testGetMostRecurringElem: " + testMostRecurringElement());
    }
}
