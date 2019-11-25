
public class DEMO {

	public static void main(String[] args) {

		int[] A = new int[] { 1, 2, 3}; // 4
		int solution = 1;
		for (int i = 0; i < A.length; i++) {
			if (solution < A[i])
				solution = A[i] - 1;
		}
		System.out.println(solution);
	}
}
