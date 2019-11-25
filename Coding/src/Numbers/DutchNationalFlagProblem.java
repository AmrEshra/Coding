package Numbers;

import java.util.Arrays;

public class DutchNationalFlagProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] a = new int[]{0,2,1,0,2};
		int low = -1;
		int mid = 0;
		int high = a.length;

		while (mid < high) {
			if (a[mid] == 0) {
				low++;
				swap(a, low, mid);
				mid++;
			} else if (a[mid] == 1) {
				mid++;
			} else if (a[mid] == 2) {
				high--;
				swap(a, mid, high);
			}
			System.out.println(Arrays.toString(a));
		}
		
		
	}
	
	static void swap(int[] a, int i, int j){
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}

}
