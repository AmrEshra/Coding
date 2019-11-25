package Numbers;

import java.util.HashMap;

public class Find_2_NumbersSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int A[] = {1 , 5 , 2 , 9 , 0 , 7 ,6 , 3 , -2 , 4};
		int sum = 7;

		find2Numbers(A, sum);

	}
	
	static void find2Numbers(int A[], int sum) {

		HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {

			if (pairs.containsKey(A[i]))
				System.out.println(A[i] + ", " + pairs.get(A[i]));
			else
				pairs.put(sum - A[i], A[i]);
			
		}
	}
}
