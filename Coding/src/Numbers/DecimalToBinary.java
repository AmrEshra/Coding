package Numbers;


public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer x = 99;

		int binary[] = new int[40];
	     int index = 0;
	     while(x > 0){
	       binary[index] = x % 2;
	       x = x / 2;
	       index++;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	     

	}

}
