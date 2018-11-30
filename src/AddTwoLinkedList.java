import Utils.Node;

import java.util.Stack;

public class AddTwoLinkedList {

    static Node head1;
    static Node head2;

    int carry=0;
    Node temp = null;
    Node result;

    public static void main(String args[]) {
        AddTwoLinkedList list = new AddTwoLinkedList();

        // creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.printList(head1);

        // creating seconnd list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printList(head2);

        // add the two lists and see the result
        list.addTwoLists(head1, head2);
        System.out.print("Resultant List is ");

        list.printList(list.result);

    }

    private Node addTwoLists(Node head1, Node head2) {
        //check size
        int size1=checkSize(head1);
        int size2=checkSize(head2);
        if(size1==size2)
            addSamesizeList(head1,head2);
        else{

            if(size2>size1){
                temp=head1;
                head1=head2;
                head2=temp;
            }
            int diff=Math.abs(size1-size2);
            Node curr=head1;
           while(diff >0){
               temp=curr.next;
               curr=temp;
               diff--;
           }
           addSamesizeList(temp,head2);
            propogatecarry(head1);
        }
        pushList(carry);

        return head1;
    }

    private void propogatecarry(Node head1) {
        if(head1!=temp){
            propogatecarry(head1.next);
            int sum=carry+head1.value;
            carry=sum/10;
            pushList(sum%10);
        }
    }

    private void pushList(int i) {
        Node newnode = new Node(i);
        newnode.next=result;
        result=newnode;
    }

    private void addSamesizeList(Node head1, Node head2) {

        int sum;
        if(head1==null){
            return;
        }
        addSamesizeList(head1.next,head2.next);
        sum= head1.value+head2.value+carry;
        carry = sum / 10;
        sum %= 10;
        pushList(sum);

    }

    private int checkSize(Node head) {
        int count = 0;
        while (head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }

    private void printList(Node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }

    }
}
