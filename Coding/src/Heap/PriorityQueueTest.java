package Heap;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(22);
		pq.add(18);
		pq.add(3);
		pq.add(19);
		pq.add(15);
		pq.add(14);
		pq.add(12);
		pq.add(-4);
		
		System.out.println(pq.toString());

	}

}
