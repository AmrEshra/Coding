package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] a = new int[]{20, 5, -15, 7};
		
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < a.length; firstUnsortedIndex++) {
            int newElement = a[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && a[i - 1] > newElement; i--) {
                a[i] = a[i - 1];
            }

            a[i] = newElement;
        }
		
		System.out.println(Arrays. toString(a));
	}

}
