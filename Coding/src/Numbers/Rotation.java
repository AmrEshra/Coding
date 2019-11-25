package Numbers;

import java.util.Arrays;


public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int [] array = new int[]{9,10,11,20,2,3,4,5,6,7,8};
		
//		int result = getMinElementInRotatedArray(array, 0 , array.length - 1);
//		int index = getMinElementIndexInRotatedArray(array, 0 , array.length - 1);
//		System.out.println("min number = " + result + " @ index " + index);
		
//		rotateArray(new int[]{1,2,3,4,5,6}, 13);
		
		getNoOfRotation(array);
		
	}

	private static void getNoOfRotation(int[] array){
		
		int index = getMinElementIndexInRotatedArray(array, 0 , array.length - 1);
		
		System.out.println("Array Rotated : " + index + " times");
		
	}
	
	private static int getMinElementInRotatedArray(int[] arr, int low, int high)
    {
        // This condition is needed to handle the case when array
        // is not rotated at all
        if (high < low)  
        	return arr[0];
 
        // If there is only one element left
        if (high == low)
        	return arr[low];
 
        // Find mid
        int mid = low + (high - low)/2; /*(low + high)/2;*/
 
        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return arr[mid+1];
 
        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];
 
        // Decide whether we need to go to left half or right half
        if (arr[high] > arr[mid])
            return getMinElementInRotatedArray(arr, low, mid-1);
        return getMinElementInRotatedArray(arr, mid+1, high);
    }

	private static int getMinElementIndexInRotatedArray(int[] arr, int low, int high)
    {
        if (high < low)  
        	return 0;
 
        if (high == low)
        	return low;
 
        int mid = low + (high - low)/2;
 
        if (mid < high && arr[mid+1] < arr[mid])
            return mid+1;
 
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;
 
        if (arr[high] > arr[mid])
            return getMinElementIndexInRotatedArray(arr, low, mid-1);
        
        return getMinElementIndexInRotatedArray(arr, mid+1, high);
    }
	
	private static void rotateArray(int [] array, int order){
			
		int realOrder = order % array.length;
		
		for (int i = 0; i < realOrder; i++) {
			for (int j = array.length - 1; j > 0; j--) {
				int temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(array));
		
	}
}
