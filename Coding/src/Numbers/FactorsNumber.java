
package Numbers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FactorsNumber {

	public static List<Integer> numbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		int n = 36;
		
		getFactors(n);
		numbers.add(1);
		numbers.add(n);
		
		System.out.println(Arrays.toString(numbers.toArray()));
	}
	
	public static List<Integer> getFactors(int n){
		
		for (int i = 2 ; i <= Math.sqrt(n) ; i++){
			
			if ( n % i == 0 ){
				numbers.add(i);
				
			if (i != Math.sqrt(n)) 
				numbers.add( n / i);
			}
		}
		
		return numbers;
	}

}
