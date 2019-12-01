package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] a = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		mergeSort(a, 0, a.length, "DESC");
		
		System.out.println(Arrays. toString(a));
	}
	
    public static void mergeSort(int[] input, int start, int end, String order) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid, order);
        mergeSort(input, mid, end, order);
        merge(input, start, mid, end, order);
    }
    
    public static void merge(int[] input, int start, int mid, int end, String order) {

    	if (order.equals("ASC")) {
	        if (input[mid - 1] <= input[mid]) {
	            return;
	        }
	
	        int i = start;
	        int j = mid;
	        int tempIndex = 0;
	
	        int[] temp = new int[end - start];
	        while (i < mid && j < end) {
	            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
	        }
	
	        System.arraycopy(input, i, input, start + tempIndex, mid - i);
	        System.arraycopy(temp, 0, input, start, tempIndex);
    	}
    	
    	else if (order.equals("DESC")) {
	        if (input[mid - 1] > input[mid]) {
	            return;
	        }
	
	        int i = start;
	        int j = mid;
	        int tempIndex = 0;
	
	        int[] temp = new int[end - start];
	        while (i < mid && j < end) {
	            temp[tempIndex++] = input[i] > input[j] ? input[i++] : input[j++];
	        }
	
	        System.arraycopy(input, i, input, start + tempIndex, mid - i);
	        System.arraycopy(temp, 0, input, start, tempIndex);
    	}


    }

}
