package LinkedList.SortedLinkedList;

public class Main {

    public static void main(String[] args) {

        NumberLinkedList list = new NumberLinkedList();

        list.addSorted(4);
        list.addSorted(2);
        list.addSorted(1);
        list.addSorted(6);
        list.addSorted(5);

        System.out.println(list.getSize());
        list.printList();
    }
}
