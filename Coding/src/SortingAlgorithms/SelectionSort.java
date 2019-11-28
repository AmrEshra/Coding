package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a = new int[]{4,50,0,900,1000};
		int minimum;
		int minimumIndex = 0;
		for(int i = 0 ; i < a.length ; i++) {
			minimum = a[i];
			minimumIndex = i;
			for(int j = i + 1; j < a.length ; j++) {
				if(a[j] < minimum) {
					minimum = a[j];
					minimumIndex = j;
				}
			}
			swap(a , i , minimumIndex);
		}
		
		System.out.println(Arrays. toString(a));
	}

	private static void swap(int[] a, int i, int minimumIndex) {
		if (a[i] <= a[minimumIndex])
			return;
		
		int t = a[minimumIndex];
		a[minimumIndex] = a[i];
		a[i] = t;
	}

}
