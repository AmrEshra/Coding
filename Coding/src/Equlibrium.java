
public class Equlibrium {
	public static void main(String[] args) {
		int[] sequence = {-7, 1, 5, 2, -4, 3, 0};
		
//		Equilibrium index of an array is an index such that the sum of elements at lower indexes 
//		is equal to the sum of elements at higher indexes
		equlibrium_indices(sequence);
	}
 
	public static void equlibrium_indices(int[] sequence){
		//find total sum
		int totalSum = 0;
		int leftsum = 0;
		for (int n : sequence) {
			totalSum += n;
		}
		//compare running sum to remaining sum to find equlibrium indices
		for (int i = 0; i < sequence.length; i++) {
			
			totalSum -= sequence[i]; // sum is now right sum for index i
			 
		      if(leftsum == totalSum)
		        System.out.println(i);
		 
		    leftsum += sequence[i];
		}
	}
}