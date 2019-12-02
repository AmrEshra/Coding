package LinkedList.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("A", "Jones", 123);
        Employee johnDoe = new Employee("B", "Doe", 4567);
        Employee marySmith = new Employee("C", "Smith", 22);
        Employee mikeWilson = new Employee("D", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToEnd(janeJones);
        list.addToEnd(johnDoe);
        list.addToEnd(marySmith);
        list.addToEnd(mikeWilson);
        list.printList();
        
        Employee amr = new Employee("Z", "Amr", 78);
        
        
        
        list.addBefore(marySmith, amr);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
