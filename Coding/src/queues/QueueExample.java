package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>(); 
		
		q.add(1);
		q.add(10);
		q.add(11);
		q.add(91);
		q.add(100);
		
		System.out.println(q.toString());

	}

}
