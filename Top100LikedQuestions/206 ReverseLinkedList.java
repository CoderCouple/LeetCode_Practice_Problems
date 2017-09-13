package Top100LikedQuestions;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;
		if (curr == null)
			return curr;

		ListNode newHead = null;
		while (curr != null) {
			newHead = new ListNode(curr.val);
			newHead.next = prev;
			prev = newHead;
			curr=curr.next;
		}

		return newHead;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		ListNode head = reverseList(n1);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
