import java.util.*;

public class QueueDemo {
	
	static String newLine = System.getProperty("line.separator");

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Queue queue = new LinkedList();

		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("5");
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
//		System.out.println("remove element: " + queue.remove());
//		System.out.println("Items in the queue..." + queue );
//		
//		System.out.println("retrieve element: " + queue.element());
//		System.out.println("Items in the queue..." + queue );

//		System.out.println("remove and retrieve element, null if empty: " + queue.poll());
//		System.out.println("Items in the queue..." + queue );

//		System.out.println("retrieve element, null is empty " + queue.peek());
//		System.out.println("Items in the queue..." + queue );
	}
}