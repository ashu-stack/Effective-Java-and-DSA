package LinkedLists;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(1);
        list.insertAtFirst(3);
        list.insertAtFirst(10);
        list.insertAtLast(22);
        list.insertAtLast(99);
        list.insertAfterVal(12,10);

        list.display();
        list.deleteVal(3);
        list.display();

       // System.out.println(list.size);
    }
}
