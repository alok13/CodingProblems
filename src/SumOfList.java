
public class SumOfList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(5);

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		return l2;

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
