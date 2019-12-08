package Heap;

import java.util.Arrays;

public class TestHeap {

	public static void main(String[] args) {
		
		Heap h = new Heap(100);
		
		h.insert(22);
		h.insert(19);
		h.insert(18);
		h.insert(15);
		h.insert(3);
		h.insert(14);
		h.insert(4);
		h.insert(12);
		
		System.out.println(h.isHeap(0));
		
		h.insert(20);
		System.out.println(Arrays.toString(h.heap));
	}


}
