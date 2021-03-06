package Strings;

public class Permutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		permutation("", "AMR");
		
		String s1s1 = "waterbottlewaterbottle";
		int index = s1s1.indexOf("erbottlewat");
		System.out.println(index);

	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0)
	    	System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
}
