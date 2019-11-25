package Numbers;

public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isPrime(31));

	}

	public static boolean isPrime(int number){
		
		if (number % 2 == 0)
			return false;
		
		for(int i = 3 ; i * i <= number ; i +=2 )
			if (number % i == 0)
				return false;
		
		return true;
	}
}
