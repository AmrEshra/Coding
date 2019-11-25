package Numbers;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(30));

	}
	
	public static int fibonacci(int number){
		
		if (number <= 1) 
			return number;
        else 
        	return fibonacci(number-1) + fibonacci(number-2);
	}

}
