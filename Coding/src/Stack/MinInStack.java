package Stack;

import java.util.Stack;

public class MinInStack {

	static Stack stack = new Stack();

	public static void main(String args[]) {

		push(5);
		push(9);
		push(3);
		push(4);
		push(0);
		push(8);

		System.out.println(stack);
	}

	@SuppressWarnings("unchecked")
	public static void push(int x) {

		if (stack.isEmpty())
			stack.push(x);
		else {
			int item = (Integer) stack.peek();

			if (x > item) {
				stack.pop();
				stack.push(x);
				stack.push(item);
			}
			else
				stack.push(x);
		}
	}
}