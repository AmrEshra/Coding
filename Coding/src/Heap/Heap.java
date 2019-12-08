package Heap;

public class Heap {

    public int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isHeap(int i) {
		
    	int n = size -1;
		if (i > (n - 2) / 2) { 
            return true; 
        }
		
		if (heap[i] >= heap[2 * i + 1] && heap[i] >= heap[2 * i + 2] 
                && isHeap(2 * i + 1) && isHeap(2 * i + 2)) { 
            return true; 
        } 
  
        return false;
	}
}
