import Utils.Node;

public class ReverseLinkedList {
    static Node head;
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);
        list.head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked list ");
        list.printList(head);
        Node res = list.reverseUtil(head, null);
        System.out.println("");
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(res);
    }

    private Node reverseUtil(Node curr, Node  prev) {
        if(curr.next==null){
            head=curr;
            head.next=prev;
            return null;
        }

        Node further=curr.next;
        curr.next=prev;
        reverseUtil(further,curr);
        return head;
    }

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

}
