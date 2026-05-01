package LinkedLists;

public class LinkedList {

    ListNode head;
    int size;

    public LinkedList (){
        this.size = 0;
    }

    public void deleteVal(int val){
        if(head == null){
            return;
        }

        if(head.val == val){
            head = null;
        }
        ListNode temp = head;
        while(temp.next.val != val){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    public void deleteAtStart(){
        if(head == null){
            return ;
        }
        head = head.next;
        size--;
    }

    public void deleteAtEnd(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void insertAfterVal(int val, int target){
        if(head == null){
            insertAtFirst(val);
        }
        ListNode temp = head;
        while(temp.val != target){
            temp = temp.next;
        }
        ListNode node = new ListNode(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void insertAtLast(int val){
        if(head == null){
            insertAtFirst(val);
        }

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        ListNode node = new ListNode(val);
        temp.next = node;
        node.next = null;
        size++;
    }

    public void insertAtFirst(int val){
        if (head == null){
            head = new ListNode(val);
            head.next = null;
            size++;
            return;
        }

        ListNode temp = new ListNode(val);
        temp.next = head;
        head = temp;
        size++;
    }

    public void display(){
        if(head == null){
            System.out.println("Empty Linked list");
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(" NULL");

    }
    private static class ListNode{
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
