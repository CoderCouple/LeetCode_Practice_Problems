package Top100LikedQuestions;

public class MergeTwoSortedLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;

		if (l2 == null)
			return l1;

		ListNode n = new ListNode(-1);
		ListNode head = n;
		ListNode temp = n;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				ListNode n1 = new ListNode(l1.val);
				temp.next = n1;
				temp = n1;
				l1 = l1.next;
			} else {
				ListNode n1 = new ListNode(l2.val);
				temp.next = n1;
				temp = n1;
				l2 = l2.next;
			}
		}

		while (l1 != null) {
			ListNode n1 = new ListNode(l1.val);
			temp.next = n1;
			temp = n1;
			l1 = l1.next;
		}

		while (l2 != null) {
			ListNode n1 = new ListNode(l2.val);
			temp.next = n1;
			temp = n1;
			l2 = l2.next;
		}

		return head.next;
	}

	public static void printList(ListNode head) {
		if (head == null)
			return;
		ListNode ptr = head;
		while (ptr != null) {
			System.out.print(ptr.val);
			if(ptr.next!=null)
			System.out.print("->");
			ptr = ptr.next;
		}

	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);

		ListNode result = mergeTwoLists(n1, n2);
		printList(result);
	}

}
