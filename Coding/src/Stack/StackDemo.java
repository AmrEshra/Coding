package Stack;

import java.util.*;

public class StackDemo {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		// creating stack
		Stack st = new Stack();

		// populating stack
		st.push("Amr");
		st.push("Ali");
		st.push("Eshra");

		// removing top object
//		System.out.println("Removed object is: " + st.pop());
//		System.out.println("Removed object is: " + st.pop());

		// elements after remove
		System.out.println("Elements after remove: " + st);
	}

}