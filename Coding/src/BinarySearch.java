public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[] { 2, 3, 4, 5, 6, 7, 7, 9, 10 };
		int start = 0;
		int end = array.length;

		int target = 5;

		System.out.println("index : " + binarySearch(array, start, end, target));

	}

	private static int binarySearch(int[] array, int start, int end, int target) {

		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}

		if (array[middle] == target)
			return middle;

		else if (target < array[middle]) {
			return binarySearch(array, start, middle - 1, target);
		} else {
			return binarySearch(array, middle + 1, end, target);

		}
	}

}
