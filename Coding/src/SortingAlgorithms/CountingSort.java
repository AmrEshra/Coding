package SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {

		int[] a = new int[]{10,20,3,1,8,4,50,50,71,20,0,9};
		
		int maxNumber = 0;
		for(int i = 0 ; i < a.length ; i++) {
			if (a[i] > maxNumber)
				maxNumber = a[i];
		}
		int[] t = new int[maxNumber + 1];
		
		for(int i = 0 ; i < a.length ; i++) {
			t[a[i]]++;
		}
		
		int mainArrayIndex = 0;
		for(int i = 0 ; i < t.length ; i++) {
			for(int j = 1 ; j <= t[i] && t[i] > 0; j++) {
				a[mainArrayIndex] = i;
				mainArrayIndex++;
			}
		}
		
		System.out.println(Arrays. toString(a));
	}

}
