package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = new int[]{100,20,3,1,50,50,71,20,0,-9};
		
		for (int i = a.length -1 ; i > 0 ;i--) {
			for(int j = 0 ; j < i ; j++) {
				if(a[j] > a[j + 1]) {
					swap(a , j , j + 1);
				}
			}
		}
		
		System.out.println(Arrays. toString(a));
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

}
