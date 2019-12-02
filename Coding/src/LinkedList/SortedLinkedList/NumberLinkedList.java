package LinkedList.SortedLinkedList;

public class NumberLinkedList {

    private NumberNode head;
    private int size;

    public void addToFront(int number) {
        NumberNode node = new NumberNode(number);
        node.setNext(head);
        head = node;
        size++;
    }
    
    public void addSorted(int number) {
    	
    	if (head == null || head.getNumber() >= number) {
            addToFront(number);
            return;
        }
    	
    	// find the insertion point
        NumberNode current = head.getNext();
        NumberNode previous = head;
        while (current != null && current.getNumber() < number) {
            previous = current;
            current = current.getNext();
        }

        NumberNode newNode = new NumberNode(number);
        newNode.setNext(current);
        previous.setNext(newNode);

        size++;
    }

    public NumberNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        NumberNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        NumberNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getNumber());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
