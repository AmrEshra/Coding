package Numbers;

import java.util.Arrays;
import java.util.HashMap;

public class SomeProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		getNoOfDublicity();
		System.out.println(power(2 , 6));
		getRang();
		seed();
		splitInteger(845922);

	}
	
	private static void splitInteger(Integer number) {

//		while (number > 0) {
//			System.out.println( number % 10);
//		    number = number / 10;
//		}
		
		String number1 = String.valueOf(number);
		for(int i = 0; i < number1.length() - 1; i++) {
		    int j = Character.digit(number1.charAt(i), 10);
		    int k = Character.digit(number1.charAt(i+1), 10);
		    if ( j < k )
		    	System.out.println("decreasing");
		    else
		    	System.out.println("increasing");
		}
	}

	private static void seed(){
		
		Integer x = 223;
		Integer y = 2676;
		
		String strintX = x.toString();
		String[] arrayX = strintX.split("");
		
		System.out.println(Arrays.toString(arrayX));
		for (int i = 1 ; i < arrayX.length ; i++)
			x = x * Integer.parseInt(arrayX[i]);
		
		if (x.equals(y))
			System.out.println("seed");
		else
			System.out.println("not");
		
	
	}

	private static void getRang(){
		
		int [] array = new int[] {0,1,2,7,21,22,1000,1001,1002,1003};
		
		Integer start = null;
		Integer end = null;
		
		for (int i = 0 ; i < array.length ; i++){
					
			if (i == 0)
				start = array[0];
			
			else if (array[i] == array[i - 1] + 1)
				end = array[i];
			
			else{
//				end = array[i];
				System.out.println(start.equals(end) ? start : start + " - " + end);
				
				start = array[i];
				end = array[i];
			}
				
		}
		System.out.println(start.equals(end) ? start : start + " - " + end);
		
	}
	
	private static int power(int base , int power){
				
		 int temp;
		    if( power == 0)
		        return 1;
		    temp = power(base, power/2);
		    if ( power % 2 == 0)
		        return temp*temp;
		    else
		        return base * temp * temp;
	    
		
	}
	
	private static void getNoOfDublicity() {
		String s = "abbcdec";
		s.toCharArray();

		String[] array = s.split("");
		System.out.println(Arrays.toString(array));

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		int value = 0;
		for (int i = 0; i < array.length; i++) {
			if (hashMap.containsKey(array[i])) {

				value = hashMap.get(array[i]) + 1;
				hashMap.put(array[i], value);
			} else
				hashMap.put(array[i], 1);
		}

		System.out.println(hashMap);
	}
}
